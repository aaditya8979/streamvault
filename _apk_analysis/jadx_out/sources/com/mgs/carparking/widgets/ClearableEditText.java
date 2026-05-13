package com.mgs.carparking.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.dramarush.shortin.R;

/* JADX INFO: loaded from: classes6.dex */
public class ClearableEditText extends AppCompatEditText implements View.OnTouchListener, View.OnFocusChangeListener, TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f45063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnFocusChangeListener f45064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnTouchListener f45065d;

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    private void setClearIconVisible(boolean z10) {
        this.f45063b.setVisible(z10, false);
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], z10 ? this.f45063b : null, compoundDrawables[3]);
    }

    public final void a(Context context) {
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.home_ico_close);
        DrawableCompat.wrap(drawable);
        this.f45063b = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicHeight(), this.f45063b.getIntrinsicHeight());
        setClearIconVisible(false);
        super.setOnTouchListener(this);
        super.setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        setSelection(editable.toString().length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (z10) {
            setClearIconVisible(getText().length() > 0);
        } else {
            setClearIconVisible(false);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f45064c;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z10);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (isFocused()) {
            setClearIconVisible(charSequence.length() > 0);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        if (!this.f45063b.isVisible() || x10 <= (getWidth() - getPaddingRight()) - this.f45063b.getIntrinsicWidth()) {
            View.OnTouchListener onTouchListener = this.f45065d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            setError(null);
            setText("");
        }
        return true;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f45064c = onFocusChangeListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f45065d = onTouchListener;
    }
}
