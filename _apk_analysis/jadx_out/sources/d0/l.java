package d0;

import coil.decode.DataSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FetchResult.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Ld0/l;", "Ld0/h;", "", "other", "", "equals", "", "hashCode", "La0/k;", "a", "La0/k;", "b", "()La0/k;", "source", "", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "Lcoil/decode/DataSource;", "c", "Lcoil/decode/DataSource;", "()Lcoil/decode/DataSource;", "dataSource", "<init>", "(La0/k;Ljava/lang/String;Lcoil/decode/DataSource;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class l extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0.k source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String mimeType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DataSource dataSource;

    public l(@NotNull a0.k kVar, @Nullable String str, @NotNull DataSource dataSource) {
        super(null);
        this.source = kVar;
        this.mimeType = str;
        this.dataSource = dataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataSource getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0.k getSource() {
        return this.source;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof l) {
            l lVar = (l) other;
            if (p.f(this.source, lVar.source) && p.f(this.mimeType, lVar.mimeType) && this.dataSource == lVar.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.dataSource.hashCode();
    }
}
