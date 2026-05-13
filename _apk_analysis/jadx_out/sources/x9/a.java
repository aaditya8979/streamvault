package x9;

import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;

/* JADX INFO: compiled from: AutoValue_TextViewTextChangeEvent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f86878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f86879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f86881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f86882e;

    public a(TextView textView, CharSequence charSequence, int i10, int i11, int i12) {
        if (textView == null) {
            throw new NullPointerException("Null view");
        }
        this.f86878a = textView;
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.f86879b = charSequence;
        this.f86880c = i10;
        this.f86881d = i11;
        this.f86882e = i12;
    }

    @Override // x9.c
    public int a() {
        return this.f86881d;
    }

    @Override // x9.c
    public int b() {
        return this.f86882e;
    }

    @Override // x9.c
    public int d() {
        return this.f86880c;
    }

    @Override // x9.c
    @NonNull
    public CharSequence e() {
        return this.f86879b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f86878a.equals(cVar.f()) && this.f86879b.equals(cVar.e()) && this.f86880c == cVar.d() && this.f86881d == cVar.a() && this.f86882e == cVar.b();
    }

    @Override // x9.c
    @NonNull
    public TextView f() {
        return this.f86878a;
    }

    public int hashCode() {
        return ((((((((this.f86878a.hashCode() ^ 1000003) * 1000003) ^ this.f86879b.hashCode()) * 1000003) ^ this.f86880c) * 1000003) ^ this.f86881d) * 1000003) ^ this.f86882e;
    }

    public String toString() {
        return "TextViewTextChangeEvent{view=" + this.f86878a + ", text=" + ((Object) this.f86879b) + ", start=" + this.f86880c + ", before=" + this.f86881d + ", count=" + this.f86882e + h.f52302e;
    }
}
