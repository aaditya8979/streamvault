package k0;

import androidx.annotation.Px;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Dimension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lk0/c;", "", "<init>", "()V", "a", "b", "Lk0/c$a;", "Lk0/c$b;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public abstract class c {

    /* JADX INFO: compiled from: Dimension.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lk0/c$a;", "Lk0/c;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "px", "<init>", "(I)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int px;

        public a(@Px int i10) {
            super(null);
            this.px = i10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.px == ((a) other).px;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getPx() {
            return this.px;
        }

        @NotNull
        public String toString() {
            return String.valueOf(this.px);
        }
    }

    /* JADX INFO: compiled from: Dimension.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lk0/c$b;", "Lk0/c;", "", "toString", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f72682a = new b();

        public b() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public c() {
    }

    public /* synthetic */ c(tn.i iVar) {
        this();
    }
}
