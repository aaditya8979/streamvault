package com.bykv.vk.openvk.ouw.ouw.vt.lh;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.ouw.ouw.ouw.ouw;
import com.bykv.vk.openvk.ouw.ouw.vt.lh.lh;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class yu implements com.bykv.vk.openvk.ouw.ouw.ouw.ouw, lh.fkw, lh.le, lh.InterfaceC0170lh, lh.ouw, lh.ra, lh.vt, lh.yu, jae.ouw {

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private static final SparseIntArray f11295jg = new SparseIntArray();
    public boolean fkw;
    private ArrayList<Runnable> jae;
    private boolean ksc;
    public boolean mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f11302od;
    private volatile boolean osn;
    public SurfaceTexture ouw;
    private boolean rrs;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private boolean f11308uq;
    public SurfaceHolder vt;
    private boolean zin;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final boolean f11299ko = false;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final List<WeakReference<ouw.InterfaceC0168ouw>> f11305rn = new CopyOnWriteArrayList();
    private final ouw zih = new ouw();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11301lh = 0;
    public int yu = 3;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private boolean f11309vm = false;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private volatile lh f11307th = null;
    private boolean qbp = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile int f11300le = 201;
    private long vpp = -1;
    public boolean pno = false;
    public long bly = 0;
    private long jqy = Long.MIN_VALUE;
    public long tlj = 0;
    private long ex = 0;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private long f11306tc = 0;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private String f11297cd = "0";

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh f11303pd = null;
    private boolean fvf = false;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private CountDownLatch f11296bs = new CountDownLatch(1);
    private volatile int fak = 200;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public AtomicBoolean f11298cf = new AtomicBoolean(false);
    private Surface uoy = null;
    private long ey = 0;
    public long ryl = 0;
    private final Runnable jvy = new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.1
        @Override // java.lang.Runnable
        public final void run() {
            if (yu.this.f11307th == null) {
                return;
            }
            long jRn = yu.this.rn();
            if (jRn > 0 && yu.this.le() && yu.this.jqy != Long.MIN_VALUE) {
                try {
                    if (yu.this.jqy == jRn) {
                        if (!yu.this.pno && yu.this.tlj >= 400) {
                            yu.this.ouw(701);
                            yu.this.pno = true;
                        }
                        yu.this.tlj += (long) yu.this.fak;
                    } else {
                        if (yu.this.pno) {
                            yu.this.bly += yu.this.tlj;
                            yu.this.ouw(702);
                            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "handleMsg:  bufferingDuration =", Long.valueOf(yu.this.bly), "  bufferCount =", Integer.valueOf(yu.this.f11301lh));
                        }
                        yu.this.tlj = 0L;
                        yu.this.pno = false;
                    }
                } catch (Throwable th2) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "error:" + th2.getMessage());
                }
            }
            if (yu.this.ko() > 0) {
                if (yu.this.jqy != jRn) {
                    if (com.bykv.vk.openvk.ouw.ouw.ouw.lh.fkw()) {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "run: lastCur = ", Long.valueOf(yu.this.jqy), "  curPosition = ", Long.valueOf(jRn));
                    }
                    yu yuVar = yu.this;
                    yu.ouw(yuVar, jRn, yuVar.ko());
                }
                yu.this.jqy = jRn;
            }
            if (yu.this.vt()) {
                yu yuVar2 = yu.this;
                yu.ouw(yuVar2, yuVar2.ko(), yu.this.ko());
            } else if (yu.this.f11304ra != null) {
                yu.this.f11304ra.postDelayed(this, yu.this.fak);
            }
        }
    };

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public jae f11304ra = com.bytedance.sdk.component.pno.ouw.ouw.ouw().ouw(this, "csj_".concat("SSMediaPlayerWrapper"));

    public class ouw implements Runnable {
        public long ouw;
        public boolean vt;

        public ouw() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (yu.this.f11307th != null) {
                try {
                    if (!this.vt) {
                        yu.this.vpp = Math.max(this.ouw, yu.this.f11307th.pno());
                    }
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start, OpStartTask:" + yu.this.vpp);
                } catch (Throwable th2) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start  error: getCurrentPosition :".concat(String.valueOf(th2)));
                }
            }
            if (yu.this.f11304ra != null) {
                yu.this.f11304ra.sendEmptyMessageDelayed(100, 0L);
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start not first play ! sendMsg --> OP_START , video start to play !");
        }
    }

    public yu() {
        this.f11302od = 0;
        this.rrs = false;
        this.f11302od = 0;
        this.rrs = true;
        th();
    }

    public static /* synthetic */ boolean bly(yu yuVar) {
        yuVar.qbp = false;
        return false;
    }

    private void jqy() {
        ArrayList<Runnable> arrayList = this.jae;
        boolean z10 = arrayList == null || arrayList.isEmpty();
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "isPendingAction:".concat(String.valueOf(z10)));
        if (z10) {
            return;
        }
        vpp();
    }

    private void lh(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) throws Throwable {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setDataSource：paly net:" + lhVar.pno());
        this.f11307th.ouw(lhVar);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setDataSource: MediaDataSource url" + lhVar.pno());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(int i10) {
        if (i10 == 701) {
            this.ey = SystemClock.elapsedRealtime();
            this.f11301lh++;
            for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ouw(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f11301lh));
            return;
        }
        if (i10 == 702) {
            if (this.ey > 0) {
                this.ryl += SystemClock.elapsedRealtime() - this.ey;
                this.ey = 0L;
            }
            for (WeakReference<ouw.InterfaceC0168ouw> weakReference2 : this.f11305rn) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().ouw((com.bykv.vk.openvk.ouw.ouw.ouw.ouw) this, Integer.MAX_VALUE);
                }
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f11301lh), " mBufferTotalTime = ", Long.valueOf(this.ryl));
            return;
        }
        if (!this.rrs || i10 != 3) {
            if (i10 == 805) {
                this.mwh = true;
                return;
            }
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "hasPendingPauseCommand:" + this.osn);
        jqy();
        zin();
        vt(this.fvf);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "onRenderStart");
    }

    private void ouw(long j10) {
        ouw ouwVar = this.zih;
        ouwVar.ouw = j10;
        if (this.f11308uq) {
            ouw(ouwVar);
        } else if (vt(this.f11303pd)) {
            ouw(this.zih);
        } else {
            vt(this.zih);
        }
    }

    public static /* synthetic */ void ouw(yu yuVar, long j10, long j11) {
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : yuVar.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw(yuVar, j10, j11);
            }
        }
    }

    private void ouw(File file) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setDataSource: try play local:" + file.getAbsolutePath());
        try {
            if (com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh()) {
                ouw(file.getAbsolutePath());
            } else {
                this.f11307th.ouw(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    private void ouw(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f11307th.ouw(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void qbp() {
        jae jaeVar = this.f11304ra;
        if (jaeVar == null || jaeVar.getLooper() == null) {
            return;
        }
        try {
            this.f11304ra.post(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.6
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerThread handlerThread;
                    if (yu.this.f11304ra == null || yu.this.f11304ra.getLooper() == null) {
                        return;
                    }
                    try {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "onDestory............");
                        com.bytedance.sdk.component.pno.ouw.ouw ouwVarOuw = com.bytedance.sdk.component.pno.ouw.ouw.ouw();
                        jae jaeVar2 = yu.this.f11304ra;
                        if (jaeVar2 instanceof com.bytedance.sdk.component.pno.ouw.vt) {
                            com.bytedance.sdk.component.pno.ouw.vt vtVar = (com.bytedance.sdk.component.pno.ouw.vt) jaeVar2;
                            com.bytedance.sdk.component.pno.ouw.yu<com.bytedance.sdk.component.pno.ouw.vt> yuVar = ouwVarOuw.ouw;
                            boolean zOffer = false;
                            if (vtVar != null) {
                                vtVar.ouw();
                                if (yuVar.vt.size() < yuVar.ouw) {
                                    zOffer = yuVar.vt.offer(vtVar);
                                }
                            }
                            if (!zOffer && (handlerThread = vtVar.ouw) != null) {
                                handlerThread.quit();
                            }
                        }
                        yu.this.f11304ra = null;
                    } catch (Throwable th2) {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "onDestroy error: ", th2);
                    }
                }
            });
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "onDestroy error: ", th2);
        }
    }

    public static /* synthetic */ boolean ryl(yu yuVar) {
        yuVar.osn = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void th() {
        StringBuilder sb2 = new StringBuilder("initMediaPlayer: ");
        sb2.append(this.f11304ra != null);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", sb2.toString());
        jae jaeVar = this.f11304ra;
        if (jaeVar != null) {
            jaeVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.10
                @Override // java.lang.Runnable
                public final void run() {
                    if (yu.this.f11307th == null) {
                        try {
                            yu.this.f11307th = new vt();
                        } catch (Throwable th2) {
                            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO_MEDIA", th2.getMessage());
                        }
                        if (yu.this.f11307th == null) {
                            return;
                        }
                        StringBuilder sb3 = new StringBuilder("initMediaPlayer mMediaPlayer is null :");
                        sb3.append(yu.this.f11307th == null);
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", sb3.toString());
                        yu.this.f11297cd = "0";
                        yu.this.f11307th.ouw((lh.fkw) yu.this);
                        yu.this.f11307th.ouw((lh.vt) yu.this);
                        yu.this.f11307th.ouw((lh.InterfaceC0170lh) yu.this);
                        yu.this.f11307th.ouw((lh.ouw) yu.this);
                        yu.this.f11307th.ouw((lh.le) yu.this);
                        yu.this.f11307th.ouw((lh.yu) yu.this);
                        yu.this.f11307th.ouw((lh.ra) yu.this);
                        try {
                            yu.this.f11307th.ryl();
                        } catch (Throwable th3) {
                            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setLooping error: ", th3);
                        }
                        yu.bly(yu.this);
                    }
                }
            });
        }
    }

    private void vm() {
        this.bly = 0L;
        this.f11301lh = 0;
        this.tlj = 0L;
        this.pno = false;
        this.jqy = Long.MIN_VALUE;
    }

    private void vpp() {
        if (this.zin) {
            return;
        }
        this.zin = true;
        Iterator it = new ArrayList(this.jae).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.jae.clear();
        this.zin = false;
    }

    private void vt(Runnable runnable) {
        try {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "enqueueAction()");
            if (this.jae == null) {
                this.jae = new ArrayList<>();
            }
            this.jae.add(runnable);
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO_MEDIA", th2.getMessage());
        }
    }

    private static boolean vt(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        return lhVar != null && lhVar.ryl;
    }

    private void zin() {
        this.f11309vm = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11306tc;
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw(this, jElapsedRealtime);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh.vt
    public final void bly() {
        this.f11300le = 209;
        f11295jg.delete(this.f11302od);
        jae jaeVar = this.f11304ra;
        if (jaeVar != null) {
            jaeVar.removeCallbacks(this.jvy);
        }
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh.le
    public final void cf() {
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw((com.bykv.vk.openvk.ouw.ouw.ouw.ouw) this, true);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final int fkw() {
        if (this.f11307th == null || this.fkw) {
            return 0;
        }
        return this.f11307th.jg();
    }

    public final void jg() {
        if (this.fkw) {
            return;
        }
        this.fkw = true;
        ArrayList<Runnable> arrayList = this.jae;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.jae.clear();
        }
        jae jaeVar = this.f11304ra;
        if (jaeVar != null) {
            try {
                jaeVar.removeCallbacksAndMessages(null);
                if (this.f11307th != null) {
                    this.f11304ra.sendEmptyMessage(103);
                }
            } catch (Throwable th2) {
                try {
                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "release error: ", th2);
                } finally {
                    qbp();
                }
            }
        }
    }

    public long ko() {
        long j10 = this.ex;
        if (j10 != 0) {
            return j10;
        }
        if (this.f11300le == 206 || this.f11300le == 207) {
            try {
                this.ex = this.f11307th.bly();
            } catch (Throwable unused) {
            }
        }
        return this.ex;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final boolean le() {
        jae jaeVar;
        return (this.f11300le == 206 || ((jaeVar = this.f11304ra) != null && jaeVar.hasMessages(100))) && !this.osn;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final boolean lh() {
        return (this.f11300le == 205) || le() || ra();
    }

    public final void mwh() {
        jae jaeVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "pause: from outer");
        if (this.fkw || (jaeVar = this.f11304ra) == null) {
            return;
        }
        jaeVar.removeMessages(100);
        this.osn = true;
        if (this.rrs) {
            if (!this.f11309vm && !vt(this.f11303pd)) {
                vt(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.13
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (yu.this.f11304ra != null) {
                            yu.this.f11304ra.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            jae jaeVar2 = this.f11304ra;
            if (jaeVar2 != null) {
                jaeVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.ksc && !vt(this.f11303pd)) {
            vt(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.12
                @Override // java.lang.Runnable
                public final void run() {
                    if (yu.this.f11304ra != null) {
                        yu.this.f11304ra.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        jae jaeVar3 = this.f11304ra;
        if (jaeVar3 != null) {
            jaeVar3.sendEmptyMessage(101);
        }
    }

    public final void ouw(final SurfaceTexture surfaceTexture) {
        if (this.fkw) {
            return;
        }
        this.ouw = surfaceTexture;
        ouw(true);
        ouw(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.3
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setSurface() runnable exec");
                yu.this.th();
                if (yu.this.f11304ra != null) {
                    yu.this.f11304ra.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #10 {all -> 0x015a, blocks: (B:31:0x00f4, B:33:0x0102, B:34:0x0106, B:39:0x0111, B:43:0x0126, B:45:0x0139, B:51:0x0146, B:53:0x014b, B:54:0x014f), top: B:203:0x00f4 }] */
    @Override // com.bytedance.sdk.component.utils.jae.ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(android.os.Message r17) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.ouw(android.os.Message):void");
    }

    public final void ouw(final SurfaceHolder surfaceHolder) {
        if (this.fkw) {
            return;
        }
        this.vt = surfaceHolder;
        ouw(true);
        ouw(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.4
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setDisplay() runnable exec");
                yu.this.th();
                if (yu.this.f11304ra != null) {
                    yu.this.f11304ra.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public final void ouw(final com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        if (this.fkw) {
            return;
        }
        this.f11303pd = lhVar;
        if (lhVar != null) {
            this.rrs = this.rrs && !lhVar.ryl;
        }
        ouw(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.5
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setDataSource() runnable exec ");
                yu.this.th();
                if (yu.this.f11304ra != null) {
                    yu.this.f11304ra.obtainMessage(107, lhVar).sendToTarget();
                }
            }
        });
    }

    public void ouw(ouw.InterfaceC0168ouw interfaceC0168ouw) {
        if (interfaceC0168ouw == null) {
            return;
        }
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() == interfaceC0168ouw) {
                return;
            }
        }
        this.f11305rn.add(new WeakReference<>(interfaceC0168ouw));
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh.ouw
    public final void ouw(lh lhVar, int i10) {
        if (this.f11307th != lhVar) {
            return;
        }
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().vt(this, i10);
            }
        }
    }

    public final void ouw(Runnable runnable) {
        boolean z10;
        if (runnable == null || (z10 = this.fkw)) {
            return;
        }
        if (z10) {
            vt(runnable);
        } else {
            runnable.run();
        }
    }

    public final void ouw(final boolean z10) {
        if (this.fkw) {
            return;
        }
        this.f11308uq = z10;
        if (this.f11307th != null) {
            this.f11307th.ouw(z10);
            return;
        }
        jae jaeVar = this.f11304ra;
        if (jaeVar != null) {
            jaeVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (yu.this.f11307th != null) {
                        yu.this.f11307th.ouw(z10);
                    }
                }
            });
        }
    }

    public final void ouw(boolean z10, long j10, boolean z11) {
        StringBuilder sb2 = new StringBuilder("[video] MediaPlayerProxy#start firstSeekToPosition=");
        sb2.append(j10);
        sb2.append(",isFirst :");
        sb2.append(z10);
        sb2.append(",isPauseOtherMusicVolume=");
        sb2.append(z11);
        sb2.append(Z7.f30794r);
        sb2.append(this.f11300le);
        sb2.append(Z7.f30794r);
        sb2.append(this.f11307th == null);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", sb2.toString());
        if (this.fkw) {
            return;
        }
        th();
        this.fvf = z11;
        this.f11298cf.set(true);
        this.osn = false;
        vt(z11);
        if (z10) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "[video] first start , SSMediaPlayer  start method !");
            this.vpp = j10;
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke !");
            ouw(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.14
                @Override // java.lang.Runnable
                public final void run() {
                    if (yu.this.f11304ra != null) {
                        yu.this.f11304ra.sendEmptyMessage(104);
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke ! sendMsg --> OP_PREPARE_ASYNC");
                    }
                }
            });
        } else {
            ouw(j10);
        }
        jae jaeVar = this.f11304ra;
        if (jaeVar != null) {
            jaeVar.removeCallbacks(this.jvy);
            this.f11304ra.postDelayed(this.jvy, this.fak);
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "start:end");
        this.f11296bs.countDown();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final boolean ouw() {
        return this.f11309vm;
    }

    public final boolean ouw(float f10) {
        if (f10 <= 0.0f) {
            return false;
        }
        try {
            if (this.f11307th == null || !lh()) {
                return false;
            }
            PlaybackParams playbackParamsVt = null;
            try {
                playbackParamsVt = this.f11307th.vt();
            } catch (Throwable th2) {
                qbp.lh("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th2.getMessage());
            }
            if ((playbackParamsVt != null ? playbackParamsVt.getSpeed() : 0.0f) == f10) {
                return true;
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.vt vtVar = new com.bykv.vk.openvk.ouw.ouw.ouw.vt();
            vtVar.ouw = f10;
            this.f11307th.ouw(vtVar);
            return true;
        } catch (Throwable th3) {
            qbp.ouw("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th3);
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh.InterfaceC0170lh
    public final boolean ouw(int i10, int i11) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO_MEDIA", "what=" + i10 + "extra=" + i11);
        SparseIntArray sparseIntArray = f11295jg;
        Integer numValueOf = Integer.valueOf(sparseIntArray.get(this.f11302od));
        if (numValueOf == null) {
            sparseIntArray.put(this.f11302od, 1);
        } else {
            sparseIntArray.put(this.f11302od, numValueOf.intValue() + 1);
        }
        this.f11300le = 200;
        jae jaeVar = this.f11304ra;
        if (jaeVar != null) {
            jaeVar.removeCallbacks(this.jvy);
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "OnError - Error code: " + i10 + " Extra code: " + i11);
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            z10 = true;
        }
        if (z10) {
            qbp();
        }
        if (!this.f11298cf.get()) {
            return true;
        }
        this.f11298cf.set(false);
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(i10, i11);
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw(this, ouwVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh.yu
    public final boolean ouw(lh lhVar, int i10, int i11) {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO_MEDIA", "what,extra:" + i10 + StringUtils.COMMA + i11);
        if (this.f11307th != lhVar) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(i10, i11);
            for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ouw(this, ouwVar);
                }
            }
        }
        ouw(i10);
        return false;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final boolean pno() {
        return this.fkw;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final boolean ra() {
        jae jaeVar;
        return ((this.f11300le != 207 && !this.osn) || (jaeVar = this.f11304ra) == null || jaeVar.hasMessages(100)) ? false : true;
    }

    public long rn() {
        if (this.fkw) {
            return 0L;
        }
        if (this.f11300le == 206 || this.f11300le == 207) {
            try {
                return this.f11307th.pno();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public final void ryl() {
        if (this.fkw) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#restart:" + this.f11300le);
        if (this.f11307th == null) {
            return;
        }
        this.f11298cf.set(true);
        if (this.f11300le != 206) {
            vm();
            this.osn = false;
            this.zih.vt = true;
            ouw(0L);
            jae jaeVar = this.f11304ra;
            if (jaeVar != null) {
                jaeVar.removeCallbacks(this.jvy);
                this.f11304ra.postDelayed(this.jvy, this.fak);
            }
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "start:end");
        this.f11296bs.countDown();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh.fkw
    public final void tlj() {
        if (this.fkw) {
            return;
        }
        this.f11300le = 205;
        try {
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar = this.f11303pd;
            if (lhVar != null) {
                float fRa = lhVar.ra();
                if (fRa > 0.0f) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.vt vtVar = new com.bykv.vk.openvk.ouw.ouw.ouw.vt();
                    vtVar.ouw = fRa;
                    this.f11307th.ouw(vtVar);
                }
            }
        } catch (Throwable th2) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "speed error: ", th2);
        }
        if (this.f11304ra != null) {
            if (this.osn) {
                jae jaeVar = this.f11304ra;
                if (jaeVar != null) {
                    jaeVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                yu.this.f11307th.fkw();
                                yu.this.f11300le = 207;
                                yu.ryl(yu.this);
                            } catch (Throwable th3) {
                                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "pauseBeforePlayIfNeed error: ", th3);
                            }
                        }
                    });
                }
            } else {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO_MEDIA", "onPrepared op_Start");
                jae jaeVar2 = this.f11304ra;
                jaeVar2.sendMessage(jaeVar2.obtainMessage(100, -1, -1));
            }
        }
        f11295jg.delete(this.f11302od);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.lh("CSJ_VIDEO_MEDIA", "onPrepared:" + this.rrs + Z7.f30794r + this.ksc);
        if (!this.rrs && !this.ksc) {
            zin();
            this.ksc = true;
        }
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().vt(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.lh.ra
    public final void vt(int i10, int i11) {
        for (WeakReference<ouw.InterfaceC0168ouw> weakReference : this.f11305rn) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ouw((com.bykv.vk.openvk.ouw.ouw.ouw.ouw) this, i10, i11);
            }
        }
    }

    public final void vt(final boolean z10) {
        if (this.fkw) {
            return;
        }
        jae jaeVar = this.f11304ra;
        if (jaeVar == null) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_VIDEO_MEDIA", "quietPlay set opHandler is null");
        } else {
            jaeVar.post(new Runnable() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.lh.yu.8
                @Override // java.lang.Runnable
                public final void run() {
                    yu yuVar = yu.this;
                    if (yuVar.fkw || yuVar.f11307th == null) {
                        return;
                    }
                    try {
                        yu.this.fvf = z10;
                        yu.this.f11307th.vt(z10);
                    } catch (Throwable th2) {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.ouw("CSJ_VIDEO_MEDIA", "setQuietPlay error: ", th2);
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final boolean vt() {
        return this.f11300le == 209;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw
    public final int yu() {
        if (this.f11307th == null || this.fkw) {
            return 0;
        }
        return this.f11307th.mwh();
    }

    public final void zih() {
        if (this.fkw) {
            return;
        }
        this.fak = 500;
    }
}
