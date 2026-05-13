package m3;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: FyberFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f73957a = new f();

    @NotNull
    public static final InneractiveFullscreenUnitController a() {
        return new InneractiveFullscreenUnitController();
    }

    @NotNull
    public static final NativeAdUnitController b() {
        return new NativeAdUnitController();
    }

    @NotNull
    public static final NativeAdVideoContentController c() {
        return new NativeAdVideoContentController();
    }

    @NotNull
    public static final InneractiveAdSpot d() {
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        p.j(inneractiveAdSpotCreateSpot, "createSpot(...)");
        return inneractiveAdSpotCreateSpot;
    }
}
