package com.green.hand.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.green.hand.library.R$styleable;
import k9.c;

/* JADX INFO: loaded from: classes9.dex */
public class EmojiEdittext extends EditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f23715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextWatcher f23720g;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (EmojiEdittext.this.f23715b != null) {
                EmojiEdittext.this.f23715b.setEnabled(!editable.toString().isEmpty());
            }
            int selectionStart = EmojiEdittext.this.getSelectionStart();
            int selectionEnd = EmojiEdittext.this.getSelectionEnd();
            EmojiEdittext.this.removeTextChangedListener(this);
            EmojiEdittext.this.d();
            EmojiEdittext.this.setText(k9.a.f(editable.toString(), EmojiEdittext.this.getTextSize()), TextView.BufferType.SPANNABLE);
            EmojiEdittext.this.setSelection(selectionStart, selectionEnd);
            EmojiEdittext.this.addTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public EmojiEdittext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23715b = null;
        this.f23719f = false;
        this.f23720g = new a();
        c(attributeSet);
    }

    public EmojiEdittext(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23715b = null;
        this.f23719f = false;
        this.f23720g = new a();
        c(attributeSet);
    }

    public final void c(AttributeSet attributeSet) {
        this.f23716c = (int) getTextSize();
        this.f23718e = (int) getTextSize();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Emojicon);
            this.f23716c = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.Emojicon_emojiconSize, getTextSize());
            this.f23717d = typedArrayObtainStyledAttributes.getInt(R$styleable.Emojicon_emojiconAlignment, 1);
            this.f23719f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Emojicon_emojiconUseSystemDefault, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(getText());
        addTextChangedListener(this.f23720g);
    }

    public final void d() {
        c.b(getContext(), getText(), this.f23716c, this.f23717d, this.f23718e, this.f23719f);
    }

    public void setEmojiconSize(int i10) {
        this.f23716c = i10;
        d();
    }

    public void setUseSystemDefault(boolean z10) {
        this.f23719f = z10;
    }
}
