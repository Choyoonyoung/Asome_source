package com.example.asome.asome_sourcerequire;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.example.asome.asome_sourcerequire.R;
import com.example.asome.asome_sourcerequire.HashTagSuggestAdapter;

public class HashTagAutoCompleteTextView extends android.support.v7.widget.AppCompatAutoCompleteTextView {
    public HashTagAutoCompleteTextView(Context context) {
        this(context, null);
    }
    public HashTagAutoCompleteTextView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.autoCompleteTextViewStyle);
    }
    public HashTagAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }
    protected void replaceText(CharSequence text) {

        clearComposingText();

        HashTagSuggestAdapter adapter = (HashTagSuggestAdapter) getAdapter();
        HashTagSuggestAdapter.HashTagFilter filter = (HashTagSuggestAdapter.HashTagFilter)adapter.getFilter();

        Editable span = getText();
        span.replace(filter.start, filter.end, text);
    }
}