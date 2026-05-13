package com.green.hand.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.green.hand.library.R$styleable;
import k9.c;

/* JADX INFO: loaded from: classes8.dex */
public class EmojiTextview extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23731g;

    public EmojiTextview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23729e = 0;
        this.f23730f = -1;
        this.f23731g = false;
        a(attributeSet);
    }

    public EmojiTextview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23729e = 0;
        this.f23730f = -1;
        this.f23731g = false;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        this.f23728d = (int) getTextSize();
        this.f23726b = (int) getTextSize();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Emojicon);
            this.f23726b = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.Emojicon_emojiconSize, getTextSize());
            this.f23727c = typedArrayObtainStyledAttributes.getInt(R$styleable.Emojicon_emojiconAlignment, 1);
            this.f23729e = typedArrayObtainStyledAttributes.getInteger(R$styleable.Emojicon_emojiconTextStart, 0);
            this.f23730f = typedArrayObtainStyledAttributes.getInteger(R$styleable.Emojicon_emojiconTextLength, -1);
            this.f23731g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Emojicon_emojiconUseSystemDefault, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(getText());
    }

    public void setEmojiconSize(int i10) {
        this.f23726b = i10;
        super.setText(getText());
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            c.a(getContext(), spannableStringBuilder, this.f23726b, this.f23727c, this.f23728d, this.f23729e, this.f23730f, this.f23731g);
            charSequence = spannableStringBuilder;
        }
        super.setText(charSequence, bufferType);
    }

    public void setUseSystemDefault(boolean z10) {
        this.f23731g = z10;
    }
}
