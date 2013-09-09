package de.halfreal.spezi.views.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import de.halfreal.spezi.views.ProgressButton;

public class ProgressButtonSample extends Activity {

	protected void enableAfterDelay(final ProgressButton button) {
		button.postDelayed(new Runnable() {

			@Override
			public void run() {
				button.setLoadingState(true);
			}
		}, 10000);
	}

	private void onClickToggleState(ProgressButton button) {

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ProgressButton button = (ProgressButton) v;
				if (button.isLoading()) {
					button.setLoadingState(true);
				} else if (button.isSelected()) {
					button.setLoadingState(false);
				} else {
					button.setLoadingState(null);
					enableAfterDelay(button);
				}
			}
		});

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progress_button_sample);

		onClickToggleState((ProgressButton) findViewById(R.id.progressButton1));
		onClickToggleState((ProgressButton) findViewById(R.id.progressButton2));
		onClickToggleState((ProgressButton) findViewById(R.id.progressButton3));
	}
}
