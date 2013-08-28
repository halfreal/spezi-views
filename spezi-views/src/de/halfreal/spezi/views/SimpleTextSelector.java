package de.halfreal.spezi.views;

import android.content.Context;

public class SimpleTextSelector implements TextSelector {

	private CharSequence checkedText;
	private CharSequence loadingText;
	private CharSequence uncheckedText;

	public SimpleTextSelector() {
	}

	public SimpleTextSelector(CharSequence checkedText,
			CharSequence loadingText, CharSequence uncheckedText) {
		super();
		this.checkedText = checkedText;
		this.loadingText = loadingText;
		this.uncheckedText = uncheckedText;
	}

	public SimpleTextSelector(Context context, int checkedText,
			int uncheckedText) {
		super();
		this.checkedText = context.getText(checkedText);
		this.uncheckedText = context.getText(uncheckedText);
	}

	public SimpleTextSelector(Context context, int checkedText,
			int uncheckedText, int loadingText) {
		super();
		this.loadingText = context.getText(loadingText);
		this.checkedText = context.getText(checkedText);
		this.uncheckedText = context.getText(uncheckedText);
	}

	@Override
	public CharSequence getSelectedText() {
		return checkedText;
	}

	@Override
	public CharSequence getLoadingText() {
		return loadingText;
	}

	@Override
	public CharSequence getText(boolean selected) {
		return selected ? getSelectedText() : getUnselectedText();
	}

	@Override
	public CharSequence getUnselectedText() {
		return uncheckedText;
	}

	public void setLoadingText(CharSequence loadingText) {
		this.loadingText = loadingText;
	}

	public void setSelectedText(CharSequence checkedText) {
		this.checkedText = checkedText;
	}

	public void setUnselectedText(CharSequence uncheckedText) {
		this.uncheckedText = uncheckedText;
	}

}
