package x9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import xl.r;

/* JADX INFO: compiled from: TextViewTextChangeEventObservable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends u9.a<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f86883b;

    /* JADX INFO: compiled from: TextViewTextChangeEventObservable.java */
    public static final class a extends yl.a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f86884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<? super c> f86885c;

        public a(TextView textView, r<? super c> rVar) {
            this.f86884b = textView;
            this.f86885c = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // yl.a
        public void onDispose() {
            this.f86884b.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (isDisposed()) {
                return;
            }
            this.f86885c.onNext(c.c(this.f86884b, charSequence, i10, i11, i12));
        }
    }

    public d(TextView textView) {
        this.f86883b = textView;
    }

    @Override // u9.a
    public void c(r<? super c> rVar) {
        a aVar = new a(this.f86883b, rVar);
        rVar.onSubscribe(aVar);
        this.f86883b.addTextChangedListener(aVar);
    }

    @Override // u9.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c b() {
        TextView textView = this.f86883b;
        return c.c(textView, textView.getText(), 0, 0, 0);
    }
}
