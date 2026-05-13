package sg.bigo.ads.ad.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ad.b.f;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.j;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.c.b;
import sg.bigo.ads.core.f.a.a;
import sg.bigo.ads.core.f.a.k;
import sg.bigo.ads.core.f.a.n;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.player.b;

/* JADX INFO: loaded from: classes5.dex */
public class c extends sg.bigo.ads.ad.b.b {

    @Nullable
    public sg.bigo.ads.core.player.c I;

    @Nullable
    public p J;
    public boolean K;
    public b L;
    private b.a O;
    private Pair<Boolean, Boolean> P;
    private AtomicBoolean Q;
    private final a R;
    private f S;
    private final sg.bigo.ads.core.g.c T;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.c$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f79906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f79907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sg.bigo.ads.core.a.a f79908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sg.bigo.ads.api.core.b f79909d;

        public AnonymousClass4(int i10, d.a aVar, sg.bigo.ads.core.a.a aVar2, sg.bigo.ads.api.core.b bVar) {
            this.f79906a = i10;
            this.f79907b = aVar;
            this.f79908c = aVar2;
            this.f79909d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f79906a != 0) {
                c.this.B();
                this.f79907b.a(c.this, 1006, this.f79906a, "Invalid media video.");
                return;
            }
            c.this.A();
            c cVar = c.this;
            p pVar = cVar.J;
            if (!c.a(cVar, (int) ((pVar != null ? pVar.f83964s : 0L) / 1000))) {
                this.f79907b.a(c.this, 1032, 1402, "Invalid video duration.");
                return;
            }
            c.this.O = new b.a() { // from class: sg.bigo.ads.ad.b.c.4.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                    if (c.this.Q.get() || AnonymousClass4.this.f79908c.bg() == 3 || AnonymousClass4.this.f79908c.bh() != null) {
                        sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "downloading or backup img is ready, stop to download img");
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "begin to download backup img");
                    c.this.Q.set(true);
                    final Pair<Boolean, Boolean> pairG = c.this.G();
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) pairG.first).booleanValue()) {
                        arrayList.add(AnonymousClass4.this.f79908c.bq().f83876b);
                    }
                    String strAT = ((sg.bigo.ads.core.a.a) c.this.f()).aT();
                    if (!TextUtils.isEmpty(strAT) && URLUtil.isNetworkUrl(strAT)) {
                        arrayList.add(AnonymousClass4.this.f79908c.aT());
                    }
                    if (arrayList.size() == 0 && !((Boolean) pairG.second).booleanValue()) {
                        AnonymousClass4.this.f79908c.k(0);
                        return;
                    }
                    AnonymousClass4.this.f79908c.k(3);
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    sg.bigo.ads.common.p.e.a(c.this.f80021b.f81864e, arrayList, anonymousClass4.f79908c.al(), new g() { // from class: sg.bigo.ads.ad.b.c.4.1.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i10, @NonNull String str, String str2) {
                            AnonymousClass4.this.f79908c.k(1);
                            if (((Boolean) pairG.second).booleanValue()) {
                                VideoController videoController = c.this.getVideoController();
                                if (videoController == null || videoController.getLoadHTMLCallback() == null) {
                                    AnonymousClass4.this.f79908c.bj();
                                } else {
                                    videoController.getLoadHTMLCallback().a();
                                }
                            }
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                            AnonymousClass4.this.f79908c.k(2);
                            AnonymousClass4.this.f79908c.a(new Pair<>(bitmap, fVar.f82369e));
                            VideoController videoController = c.this.getVideoController();
                            if (videoController != null) {
                                videoController.notifyBackupResourceReady();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i10) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    final c cVar2 = c.this;
                    final sg.bigo.ads.core.a.a aVar = anonymousClass4.f79908c;
                    if (!cVar2.J() && !cVar2.M && aVar != null && aVar.aR()) {
                        cVar2.M = true;
                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.d.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ sg.bigo.ads.core.a.a f79917a;

                            public AnonymousClass1(final sg.bigo.ads.core.a.a aVar2) {
                                aVar = aVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String strB = o.b(d.this.f80021b.f81864e, aVar.aN());
                                    if (TextUtils.isEmpty(strB)) {
                                        return;
                                    }
                                    File file = new File(URI.create(strB));
                                    if (!file.exists() || file.length() <= 0) {
                                        return;
                                    }
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                                    d.this.A = sg.bigo.ads.common.w.b.a(bitmapDecodeFile);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                    c.this.a("is_cache", Boolean.valueOf(i10 == 0));
                    AnonymousClass4.this.f79908c.ba();
                    c.a(c.this);
                    c cVar3 = c.this;
                    if (cVar3.f80024e || cVar3.f80025f) {
                        return;
                    }
                    c.b(cVar3, i10);
                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                    anonymousClass42.f79907b.a(c.this);
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.f80024e || cVar2.f80025f) {
                        return;
                    }
                    anonymousClass4.f79908c.h(2);
                    if (AnonymousClass4.this.f79909d.x() != 1) {
                        AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                        anonymousClass42.f79907b.a(c.this, aVar.d(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.", true);
                    } else if (AnonymousClass4.this.f79908c.bh() != null || aVar.d()) {
                        AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                        anonymousClass43.f79907b.a(c.this);
                    } else {
                        sg.bigo.ads.core.d.b.a(AnonymousClass4.this.f79908c, aVar.f82144b, str, 0L, aVar.f82149g / 1024, 2, "video", aVar.f82157o);
                        AnonymousClass4 anonymousClass44 = AnonymousClass4.this;
                        anonymousClass44.f79907b.a(c.this, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.");
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i10) {
                    sg.bigo.ads.core.a.a aVar;
                    int i11;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.f80024e || cVar2.f80025f) {
                        return;
                    }
                    if (anonymousClass4.f79908c.aO()) {
                        aVar = AnonymousClass4.this.f79908c;
                        i11 = 3;
                    } else {
                        aVar = AnonymousClass4.this.f79908c;
                        i11 = 4;
                    }
                    aVar.h(i11);
                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                    anonymousClass42.f79907b.a(c.this, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, i10, "Failed to download media video.");
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            c cVar2 = c.this;
            bVarA.a(cVar2.f80021b.f81864e, this.f79908c, cVar2.O);
        }
    }

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AdInteractionListener f79914a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f79914a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.f79914a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            if (this.f79914a != null) {
                if (adError.getCode() == 2002 && c.this.p()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "don't call onAdError when video has impressed");
                } else {
                    this.f79914a.onAdError(adError);
                }
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.f79914a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            AdInteractionListener adInteractionListener = this.f79914a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdOpened();
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public c(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.Q = new AtomicBoolean(false);
        this.R = new a();
        this.T = new sg.bigo.ads.core.g.c() { // from class: sg.bigo.ads.ad.b.c.1
            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, @Nullable Object obj, @Nullable int[] iArr) {
                c.a(c.this, str, obj, iArr);
            }

            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, @Nullable int[] iArr) {
                c.a(c.this, str, iArr);
            }
        };
    }

    public static /* synthetic */ int a(c cVar, String str) {
        if (q.a((CharSequence) str)) {
            return 10074;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) cVar.f();
        k kVarH = cVar.H();
        p pVarA = kVarH.a(cVar.f80021b.f81864e, str);
        int i10 = kVarH.f83925a;
        String str2 = kVarH.f83927c;
        long j10 = kVarH.f83926b;
        if (i.f81802a.n().a(9) && URLUtil.isHttpUrl(str2)) {
            sg.bigo.ads.core.d.b.a(aVar, i10, str2, j10, 10076, "Invalid http url");
            return 10076;
        }
        if (pVarA != null && pVarA.f83959n != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pVarA.f83959n.f83902c.hashCode());
            pVarA.f83960o = sb2.toString();
            cVar.I = new sg.bigo.ads.core.player.c(cVar.f80021b.f81864e, pVarA, cVar.f80023d);
            aVar.a(pVarA);
            cVar.J = pVarA;
            cVar.G();
            sg.bigo.ads.core.d.b.a(aVar, i10, j10);
            return 0;
        }
        sg.bigo.ads.core.f.a.e eVar = kVarH.f83928d;
        List<n> list = kVarH.f83929e;
        if (eVar == null) {
            return 10075;
        }
        int i11 = eVar.f83909a;
        if (i11 != 10062) {
        }
        Context context = cVar.f80021b.f81864e;
        sg.bigo.ads.core.f.a.f fVar = sg.bigo.ads.core.f.a.f.XML_PARSING_ERROR;
        sg.bigo.ads.core.player.c.a(context, list);
        sg.bigo.ads.core.d.b.a(aVar, i10, str2, j10, i11, eVar.f83910b);
        return i11;
    }

    public static /* synthetic */ void a(c cVar) {
        VideoController videoController = cVar.getVideoController();
        if (videoController != null) {
            videoController.notifyResourceReady();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static /* synthetic */ void a(c cVar, String str, Object obj, int[] iArr) {
        sg.bigo.ads.core.a.a aVar;
        d.a<T> aVar2;
        aVar = (sg.bigo.ads.core.a.a) cVar.f();
        str.hashCode();
        switch (str) {
            case "AdLoaded":
                f fVar = cVar.S;
                if (fVar != null && (aVar2 = fVar.f79926e) != 0) {
                    aVar2.a(fVar.f79922a);
                    break;
                }
                break;
            case "AdVideoThirdQuartile":
                sg.bigo.ads.core.player.c cVar2 = cVar.I;
                if (cVar2 != null) {
                    Iterator<Integer> it = cVar2.f84383j.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        if (75 >= iIntValue) {
                            if (iIntValue == 75) {
                                sg.bigo.ads.core.c.b bVar = cVar2.f84379f;
                                if (bVar != null) {
                                    bVar.a(b.EnumC1043b.f83697c);
                                }
                                iIntValue = 5;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue);
                            it.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoMidpoint":
                sg.bigo.ads.core.player.c cVar3 = cVar.I;
                if (cVar3 != null) {
                    Iterator<Integer> it2 = cVar3.f84383j.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = it2.next().intValue();
                        if (50 >= iIntValue2) {
                            if (iIntValue2 == 50) {
                                sg.bigo.ads.core.c.b bVar2 = cVar3.f84379f;
                                if (bVar2 != null) {
                                    bVar2.a(b.EnumC1043b.f83696b);
                                }
                                iIntValue2 = 4;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue2);
                            it2.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoFirstQuartile":
                sg.bigo.ads.core.player.c cVar4 = cVar.I;
                if (cVar4 != null) {
                    Iterator<Integer> it3 = cVar4.f84383j.iterator();
                    while (it3.hasNext()) {
                        int iIntValue3 = it3.next().intValue();
                        if (25 >= iIntValue3) {
                            if (iIntValue3 == 25) {
                                sg.bigo.ads.core.c.b bVar3 = cVar4.f84379f;
                                if (bVar3 != null) {
                                    bVar3.a(b.EnumC1043b.f83695a);
                                }
                                iIntValue3 = 3;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue3);
                            it3.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVPAIDClickThru":
                if (iArr != null && iArr.length > 0) {
                    cVar.b(obj instanceof sg.bigo.ads.common.i ? (sg.bigo.ads.common.i) obj : null, 12, 5);
                    break;
                }
                break;
            case "AdError":
                f fVar2 = cVar.S;
                if (fVar2 != null) {
                    String str2 = obj instanceof String ? (String) obj : "VPAID error";
                    d.a<T> aVar3 = fVar2.f79926e;
                    if (aVar3 != 0) {
                        aVar3.a(fVar2.f79922a, 1006, 10222, str2);
                    }
                    break;
                }
                break;
            case "AdVPAIDImpression":
                f fVar3 = cVar.S;
                if (fVar3 != null && fVar3.a()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "vpaid impression method");
                    super.a_();
                    break;
                }
                break;
            case "AdVideoStart":
                sg.bigo.ads.core.player.c cVar5 = cVar.I;
                if (cVar5 != null) {
                    Iterator<Integer> it4 = cVar5.f84383j.iterator();
                    while (it4.hasNext()) {
                        int iIntValue4 = it4.next().intValue();
                        if (iIntValue4 <= 0) {
                            if (iIntValue4 == 0) {
                                sg.bigo.ads.core.c.b bVar4 = cVar5.f84379f;
                                if (bVar4 != null) {
                                    bVar4.a(cVar5.f84374a.f83964s, cVar5.f84380g ? 0.0f : 1.0f);
                                }
                                iIntValue4 = 2;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, iIntValue4);
                            it4.remove();
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(sg.bigo.ads.ad.b.c r18, java.lang.String r19, int[] r20) {
        /*
            Method dump skipped, instruction units count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.b.c.a(sg.bigo.ads.ad.b.c, java.lang.String, int[]):void");
    }

    public static /* synthetic */ boolean a(c cVar, int i10) {
        return ((sg.bigo.ads.core.a.a) cVar.f()).x() != 4 || i10 >= 5;
    }

    public static /* synthetic */ void b(c cVar, int i10) {
        ((sg.bigo.ads.core.a.a) cVar.f()).h(i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 3 : 4 : 1);
    }

    @Override // sg.bigo.ads.ad.b.b
    public final List<sg.bigo.ads.core.c.a> D() {
        List<sg.bigo.ads.core.c.a> list;
        p pVar = this.J;
        return (pVar == null || (list = pVar.C) == null || list.size() <= 0) ? super.D() : list;
    }

    @Override // sg.bigo.ads.ad.b.b
    public final boolean F() {
        return ((sg.bigo.ads.core.a.a) f()).aR();
    }

    public final Pair<Boolean, Boolean> G() {
        boolean z10;
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        Pair<Boolean, Boolean> pair = this.P;
        if (pair != null) {
            return pair;
        }
        p pVar = this.J;
        boolean z11 = false;
        if (pVar != null) {
            z10 = false;
            for (sg.bigo.ads.core.f.a.a aVar2 : pVar.A) {
                if (aVar2 != null) {
                    a.C1046a c1046aA = sg.bigo.ads.core.f.a.a.a(aVar2.f83874b);
                    if (!z11 && c1046aA != null && c1046aA.a()) {
                        aVar.a(c1046aA);
                        z11 = true;
                    }
                    a.C1046a c1046aA2 = sg.bigo.ads.core.f.a.a.a(aVar2.f83873a);
                    if (!z10 && c1046aA2 != null && c1046aA2.a()) {
                        aVar.b(c1046aA2);
                        z10 = true;
                    }
                }
            }
        } else {
            z10 = false;
        }
        Pair<Boolean, Boolean> pair2 = new Pair<>(Boolean.valueOf(z11), Boolean.valueOf(z10));
        this.P = pair2;
        return pair2;
    }

    @NonNull
    public k H() {
        int iG = this.f80021b.f81861b.g();
        h hVar = i.f81802a;
        return new k(iG, (hVar == null || hVar.r() == null) ? 0 : hVar.r().a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public final void a(Point point, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        super.a(point, i10, i11, dVar);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != 0) {
            cVar.a((sg.bigo.ads.api.core.b) f());
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, imageView, adOptionsView, list, i10, viewArr);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            cVar.f84379f = ((sg.bigo.ads.ad.b.b) this).C;
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public void a(@Nullable MediaView mediaView) {
        f fVar;
        if (this.J == null || mediaView == null) {
            return;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (!aVar.aS() || (fVar = this.S) == null) {
            mediaView.a(aVar, this.J, this.T);
            a(mediaView.getVideoController(), this.f80021b.f81861b.i());
            return;
        }
        boolean zI = this.f80021b.f81861b.i();
        if (fVar.f79925d != null) {
            mediaView.a(fVar.f79929h);
            VideoController videoController = mediaView.getVideoController();
            if (videoController != null) {
                videoController.mute(zI);
            }
        }
    }

    public void a(VideoController videoController, boolean z10) {
        if (videoController != null) {
            videoController.mute(z10);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public void a(@NonNull final d.a<NativeAd> aVar, int i10) {
        j jVarN;
        final sg.bigo.ads.api.core.b bVar = this.f80021b.f81860a;
        if (!(bVar instanceof sg.bigo.ads.core.a.a)) {
            aVar.a(this, 1030, 1400, "NativeVideo with invalid AdData class type.");
            return;
        }
        n.c cVarAy = ((sg.bigo.ads.core.a.a) bVar).ay();
        if (cVarAy == null) {
            aVar.a(this, 1031, 1401, "Missing media video.");
            return;
        }
        final String strC = cVarAy.c();
        h hVar = i.f81802a;
        if (hVar == null || (jVarN = hVar.n()) == null || !jVarN.a(14)) {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, strC), false);
                }
            });
        } else {
            sg.bigo.ads.common.u.a.e.f().execute(new Runnable() { // from class: sg.bigo.ads.ad.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, strC), true);
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(@NonNull d.a<NativeAd> aVar, @NonNull sg.bigo.ads.api.core.b bVar, int i10, boolean z10) {
        m mVarE;
        sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) f();
        if (!aVar2.aS()) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(i10, aVar, aVar2, bVar);
            if (z10) {
                sg.bigo.ads.common.n.d.a(1, anonymousClass4);
                return;
            } else {
                anonymousClass4.run();
                return;
            }
        }
        this.f81826ac.f81898a = aVar2.bs();
        f fVar = new f(this.f80021b.f81864e, this.T, aVar2, this.J, aVar, this);
        this.S = fVar;
        int iX = fVar.f79924c.x();
        boolean z11 = false;
        if (iX != 1 && iX != 2 && (iX == 3 || iX == 4 || (iX == 12 ? !((mVarE = fVar.f79924c.e()) == null || 6 != mVarE.a("video_play_page.ad_component_layout", 1)) : iX == 20))) {
            z11 = true;
        }
        if (!z11) {
            fVar.f79926e.a(fVar.f79922a, 1006, 10066, "Failed to support VPAID.");
            return;
        }
        f.AnonymousClass1 anonymousClass1 = new f.AnonymousClass1(i10);
        if (z10) {
            sg.bigo.ads.common.n.d.a(1, anonymousClass1);
        } else {
            anonymousClass1.run();
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void a_() {
        f fVar = this.S;
        if (fVar == null || !fVar.a()) {
            super.a_();
            sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "BIGOAds impression method");
        }
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        VideoController videoController = getVideoController();
        if (videoController != null) {
            videoController.setVideoLifeCallback(null);
        }
        super.destroyInMainThread();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (cVar.f84376c && !cVar.f84375b) {
                cVar.f84375b = true;
            }
            p pVar = cVar.f84374a;
            if (pVar != null) {
                Iterator<sg.bigo.ads.core.f.a.n> it = pVar.f83957l.iterator();
                while (it.hasNext()) {
                    cVar.a(it.next(), "va_des");
                }
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "destroy");
            cVar.f84379f = null;
        }
        f fVar = this.S;
        if (fVar != null) {
            sg.bigo.ads.core.player.b.d dVar = fVar.f79929h;
            if (dVar != null) {
                u.b(dVar);
                fVar.f79929h.d();
                fVar.f79929h = null;
            }
            fVar.f79922a = null;
            fVar.f79924c = null;
            fVar.f79928g = null;
            fVar.f79925d = null;
            this.S = null;
        }
        this.O = null;
    }

    public boolean e(int i10) {
        return (sg.bigo.ads.api.core.a.e(i10) && this.f80021b.f81861b.h()) || (this instanceof sg.bigo.ads.ad.b.a.b) || this.K;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.VIDEO;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.NativeAd
    @Nullable
    public VideoController getVideoController() {
        MediaView mediaView = ((sg.bigo.ads.ad.b.b) this).E;
        if (mediaView != null) {
            return mediaView.getVideoController();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public void h() {
        super.h();
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (!cVar.f84375b) {
                cVar.f84375b = true;
            }
            sg.bigo.ads.core.player.c.a(aVar, 1);
            Iterator<sg.bigo.ads.core.f.a.n> it = cVar.f84374a.f83946a.iterator();
            while (it.hasNext()) {
                cVar.a(it.next(), "va_show", aVar);
            }
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(this.R);
        this.R.f79914a = adInteractionListener;
    }
}
