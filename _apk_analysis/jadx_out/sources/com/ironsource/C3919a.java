package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3919a extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f30844l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC3937b f30845m = new C0368a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final InterfaceC4267t9 f30846n = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30850d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3937b f30847a = f30845m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4267t9 f30848b = f30846n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f30849c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30851e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30852f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30853g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f30854h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30855i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30856j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f30857k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    public class C0368a implements InterfaceC3937b {
        @Override // com.ironsource.InterfaceC3937b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC3937b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$b */
    public class b implements InterfaceC4267t9 {
        @Override // com.ironsource.InterfaceC4267t9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3919a c3919a = C3919a.this;
            c3919a.f30854h = (c3919a.f30854h + 1) % Integer.MAX_VALUE;
        }
    }

    public C3919a(int i10) {
        this.f30850d = i10;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    public int a() {
        return this.f30856j;
    }

    public C3919a a(InterfaceC3937b interfaceC3937b) {
        if (interfaceC3937b == null) {
            this.f30847a = f30845m;
        } else {
            this.f30847a = interfaceC3937b;
        }
        return this;
    }

    public C3919a a(InterfaceC4267t9 interfaceC4267t9) {
        if (interfaceC4267t9 == null) {
            this.f30848b = f30846n;
        } else {
            this.f30848b = interfaceC4267t9;
        }
        return this;
    }

    public C3919a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f30851e = str;
        return this;
    }

    public C3919a a(boolean z10) {
        this.f30853g = z10;
        return this;
    }

    public void a(int i10) {
        this.f30855i = i10;
    }

    public int b() {
        return this.f30855i;
    }

    public C3919a b(boolean z10) {
        this.f30852f = z10;
        return this;
    }

    public C3919a c() {
        this.f30851e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f30856j < this.f30855i) {
            int i11 = this.f30854h;
            this.f30849c.post(this.f30857k);
            try {
                Thread.sleep(this.f30850d);
                if (this.f30854h != i11) {
                    this.f30856j = 0;
                } else if (this.f30853g || !Debug.isDebuggerConnected()) {
                    this.f30856j++;
                    this.f30847a.a();
                    String str = C4228r4.f33393l;
                    if (str != null && !str.trim().isEmpty()) {
                        new P5(C4228r4.f33393l, String.valueOf(System.currentTimeMillis()), Z7.f30787k).a();
                    }
                } else {
                    if (this.f30854h != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f30854h;
                }
            } catch (InterruptedException e10) {
                this.f30848b.a(e10);
                return;
            }
        }
        if (this.f30856j >= this.f30855i) {
            this.f30847a.b();
        }
    }
}
