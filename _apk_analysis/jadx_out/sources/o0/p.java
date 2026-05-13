package o0;

import k0.Size;
import k0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HardwareBitmaps.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0005B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lo0/p;", "Lo0/m;", "Lk0/g;", "size", "", "a", "b", "Lo0/q;", "Lo0/q;", "logger", "<init>", "(Lo0/q;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class p extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final q logger;

    public p(@Nullable q qVar) {
        super(null);
        this.logger = qVar;
    }

    @Override // o0.m
    public boolean a(@NotNull Size size) {
        k0.c width = size.getWidth();
        if ((width instanceof c.a ? ((c.a) width).px : Integer.MAX_VALUE) > 100) {
            k0.c height = size.getHeight();
            if ((height instanceof c.a ? ((c.a) height).px : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // o0.m
    /* JADX INFO: renamed from: b */
    public boolean getAllowHardware() {
        return l.f75978a.b(this.logger);
    }
}
