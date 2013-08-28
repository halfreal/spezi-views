package de.halfreal.spezi.views;

public interface TextSelector {

	CharSequence getSelectedText();

	CharSequence getLoadingText();

	CharSequence getText(boolean selected);

	CharSequence getUnselectedText();
}
