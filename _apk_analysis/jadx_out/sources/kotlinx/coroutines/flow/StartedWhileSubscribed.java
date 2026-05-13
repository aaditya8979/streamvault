package kotlinx.coroutines.flow;

import cn.f0;
import cn.v;
import go.d;
import go.f;
import go.u;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class StartedWhileSubscribed implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f73389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73390c;

    public StartedWhileSubscribed(long j10, long j11) {
        this.f73389b = j10;
        this.f73390c = j11;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.a
    @NotNull
    public d<SharingCommand> a(@NotNull u<Integer> uVar) {
        return f.p(f.q(f.P(uVar, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f73389b == startedWhileSubscribed.f73389b && this.f73390c == startedWhileSubscribed.f73390c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f73389b) * 31) + Long.hashCode(this.f73390c);
    }

    @NotNull
    public String toString() {
        List listD = v.d(2);
        if (this.f73389b > 0) {
            listD.add("stopTimeout=" + this.f73389b + "ms");
        }
        if (this.f73390c < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.f73390c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + f0.D0(v.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
