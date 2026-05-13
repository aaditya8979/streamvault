package com.green.hand.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import com.green.hand.library.R$styleable;
import k9.c;

/* JADX INFO: loaded from: classes12.dex */
public class EmojiMultiAutoCompleteTextView extends AppCompatMultiAutoCompleteTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23725e;

    public EmojiMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23725e = false;
        a(attributeSet);
    }

    public EmojiMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23725e = false;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        this.f23722b = (int) getTextSize();
        this.f23724d = (int) getTextSize();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Emojicon);
            this.f23722b = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.Emojicon_emojiconSize, getTextSize());
            this.f23723c = typedArrayObtainStyledAttributes.getInt(R$styleable.Emojicon_emojiconAlignment, 1);
            this.f23725e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Emojicon_emojiconUseSystemDefault, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(getText());
    }

    public final void b() {
        c.b(getContext(), getText(), this.f23722b, this.f23723c, this.f23724d, this.f23725e);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        b();
    }

    public void setEmojiconSize(int i10) {
        this.f23722b = i10;
        b();
    }

    public void setUseSystemDefault(boolean z10) {
        this.f23725e = z10;
    }
}
