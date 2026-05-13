package t0;

import android.content.Context;
import es.g;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AVTransportController.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final C1058a f84576j = new C1058a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final TransportAction[] f84577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final TransportAction[] f84578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final TransportAction[] f84579m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f84580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public s0.a f84581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public es.d f84582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public es.c f84583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final p0.b f84584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final g f84585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final es.b f84586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public String f84587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f84588i;

    /* JADX INFO: renamed from: t0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AVTransportController.kt */
    public static final class C1058a {
        public C1058a() {
        }

        public /* synthetic */ C1058a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AVTransportController.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransportState.values().length];
            try {
                iArr[TransportState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransportState.PAUSED_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        TransportAction transportAction = TransportAction.Play;
        f84577k = new TransportAction[]{transportAction};
        TransportAction transportAction2 = TransportAction.Stop;
        TransportAction transportAction3 = TransportAction.Seek;
        f84578l = new TransportAction[]{transportAction2, TransportAction.Pause, transportAction3};
        f84579m = new TransportAction[]{transportAction, transportAction3, transportAction2};
    }

    public a(@NotNull Context context) {
        p.k(context, "applicationContext");
        this.f84580a = context;
        this.f84582c = new es.d();
        this.f84583d = new es.c();
        this.f84584e = p0.b.f76945b.a("AVTransportController");
        this.f84585f = new g();
        this.f84586g = new es.b(new StorageMedium[]{StorageMedium.UNKNOWN});
    }

    @Override // t0.f
    @NotNull
    public es.c a() {
        return this.f84583d;
    }

    @Override // t0.f
    @NotNull
    public es.f b() {
        s0.a aVar = this.f84581b;
        return aVar != null ? new es.f(aVar.getState().toTransportState(), TransportStatus.OK, "1") : new es.f();
    }

    @Override // t0.f
    @NotNull
    public g c() {
        return this.f84585f;
    }

    @Override // t0.f
    @NotNull
    public TransportAction[] d() {
        TransportState transportStateB = b().b();
        int i10 = transportStateB == null ? -1 : b.$EnumSwitchMapping$0[transportStateB.ordinal()];
        return i10 != 1 ? i10 != 2 ? f84577k : f84579m : f84578l;
    }

    @Override // t0.f
    @NotNull
    public es.d e() {
        s0.a aVar = this.f84581b;
        if (aVar == null) {
            return new es.d();
        }
        long j10 = 1000;
        String strI = ir.f.i(aVar.getDuration() / j10);
        String strI2 = ir.f.i(aVar.getCurrentPosition() / j10);
        return new es.d(0L, strI, this.f84587h, strI2, strI2);
    }

    @Override // t0.f
    @NotNull
    public es.b f() {
        return this.f84586g;
    }

    public final void g(@Nullable s0.a aVar) {
        if (aVar != null) {
            this.f84583d = new es.c(this.f84587h, this.f84588i);
            this.f84582c = new es.d(0L, this.f84588i, this.f84587h);
        } else {
            s0.a aVar2 = this.f84581b;
            if (aVar2 != null) {
                aVar2.stop();
            }
            this.f84583d = new es.c();
            this.f84582c = new es.d();
        }
        this.f84581b = aVar;
    }
}
