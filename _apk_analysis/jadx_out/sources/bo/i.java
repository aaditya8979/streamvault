package bo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator<String>, un.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f5690g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CharSequence f5691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5695f;

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public i(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, TypedValues.Custom.S_STRING);
        this.f5691b = charSequence;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5692c = 0;
        int i10 = this.f5694e;
        int i11 = this.f5693d;
        this.f5693d = this.f5695f + i10;
        return this.f5691b.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11 = this.f5692c;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f5695f < 0) {
            this.f5692c = 2;
            return false;
        }
        int i12 = -1;
        int length = this.f5691b.length();
        int length2 = this.f5691b.length();
        for (int i13 = this.f5693d; i13 < length2; i13++) {
            char cCharAt = this.f5691b.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i12 = (cCharAt == '\r' && (i10 = i13 + 1) < this.f5691b.length() && this.f5691b.charAt(i10) == '\n') ? 2 : 1;
                length = i13;
                this.f5692c = 1;
                this.f5695f = i12;
                this.f5694e = length;
                return true;
            }
        }
        this.f5692c = 1;
        this.f5695f = i12;
        this.f5694e = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
