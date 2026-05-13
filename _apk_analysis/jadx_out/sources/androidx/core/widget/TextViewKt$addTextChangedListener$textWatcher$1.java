package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import bn.r;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    public final /* synthetic */ sn.l<Editable, r> $afterTextChanged;
    public final /* synthetic */ sn.r<CharSequence, Integer, Integer, Integer, r> $beforeTextChanged;
    public final /* synthetic */ sn.r<CharSequence, Integer, Integer, Integer, r> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(sn.l<? super Editable, r> lVar, sn.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, r> rVar, sn.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, r> rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }
}
