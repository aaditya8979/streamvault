package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class d23 implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f88706c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f88707d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f88708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zk f88709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zk f88710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zk f88711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f88712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c23 f88713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f88714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f88715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f88716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f88717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f88718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f88719p;

    public d23() {
        zk zkVar = zk.f97640e;
        this.f88708e = zkVar;
        this.f88709f = zkVar;
        this.f88710g = zkVar;
        this.f88711h = zkVar;
        ByteBuffer byteBuffer = bl.f88040a;
        this.f88714k = byteBuffer;
        this.f88715l = byteBuffer.asShortBuffer();
        this.f88716m = byteBuffer;
        this.f88705b = -1;
    }

    @Override // yads.bl
    public final ByteBuffer a() {
        int i10;
        c23 c23Var = this.f88713j;
        if (c23Var != null && (i10 = c23Var.f88296m * c23Var.f88285b * 2) > 0) {
            if (this.f88714k.capacity() < i10) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f88714k = byteBufferOrder;
                this.f88715l = byteBufferOrder.asShortBuffer();
            } else {
                this.f88714k.clear();
                this.f88715l.clear();
            }
            ShortBuffer shortBuffer = this.f88715l;
            int iMin = Math.min(shortBuffer.remaining() / c23Var.f88285b, c23Var.f88296m);
            shortBuffer.put(c23Var.f88295l, 0, c23Var.f88285b * iMin);
            int i11 = c23Var.f88296m - iMin;
            c23Var.f88296m = i11;
            short[] sArr = c23Var.f88295l;
            int i12 = c23Var.f88285b;
            System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
            this.f88718o += (long) i10;
            this.f88714k.limit(i10);
            this.f88716m = this.f88714k;
        }
        ByteBuffer byteBuffer = this.f88716m;
        this.f88716m = bl.f88040a;
        return byteBuffer;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) throws al {
        if (zkVar.f97643c != 2) {
            throw new al(zkVar);
        }
        int i10 = this.f88705b;
        if (i10 == -1) {
            i10 = zkVar.f97641a;
        }
        this.f88708e = zkVar;
        zk zkVar2 = new zk(i10, zkVar.f97642b, 2);
        this.f88709f = zkVar2;
        this.f88712i = true;
        return zkVar2;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c23 c23Var = this.f88713j;
            c23Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f88717n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = c23Var.f88285b;
            int i11 = iRemaining2 / i10;
            short[] sArrB = c23Var.b(c23Var.f88293j, c23Var.f88294k, i11);
            c23Var.f88293j = sArrB;
            shortBufferAsShortBuffer.get(sArrB, c23Var.f88294k * c23Var.f88285b, ((i10 * i11) * 2) / 2);
            c23Var.f88294k += i11;
            c23Var.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // yads.bl
    public final void b() {
        int i10;
        c23 c23Var = this.f88713j;
        if (c23Var != null) {
            int i11 = c23Var.f88294k;
            float f10 = c23Var.f88286c;
            float f11 = c23Var.f88287d;
            int i12 = c23Var.f88296m + ((int) ((((i11 / (f10 / f11)) + c23Var.f88298o) / (c23Var.f88288e * f11)) + 0.5f));
            c23Var.f88293j = c23Var.b(c23Var.f88293j, i11, (c23Var.f88291h * 2) + i11);
            int i13 = 0;
            while (true) {
                i10 = c23Var.f88291h * 2;
                int i14 = c23Var.f88285b;
                if (i13 >= i10 * i14) {
                    break;
                }
                c23Var.f88293j[(i14 * i11) + i13] = 0;
                i13++;
            }
            c23Var.f88294k = i10 + c23Var.f88294k;
            c23Var.a();
            if (c23Var.f88296m > i12) {
                c23Var.f88296m = i12;
            }
            c23Var.f88294k = 0;
            c23Var.f88301r = 0;
            c23Var.f88298o = 0;
        }
        this.f88719p = true;
    }

    @Override // yads.bl
    public final void flush() {
        if (isActive()) {
            zk zkVar = this.f88708e;
            this.f88710g = zkVar;
            zk zkVar2 = this.f88709f;
            this.f88711h = zkVar2;
            if (this.f88712i) {
                this.f88713j = new c23(zkVar.f97641a, zkVar.f97642b, this.f88706c, this.f88707d, zkVar2.f97641a);
            } else {
                c23 c23Var = this.f88713j;
                if (c23Var != null) {
                    c23Var.f88294k = 0;
                    c23Var.f88296m = 0;
                    c23Var.f88298o = 0;
                    c23Var.f88299p = 0;
                    c23Var.f88300q = 0;
                    c23Var.f88301r = 0;
                    c23Var.f88302s = 0;
                    c23Var.f88303t = 0;
                    c23Var.f88304u = 0;
                    c23Var.f88305v = 0;
                }
            }
        }
        this.f88716m = bl.f88040a;
        this.f88717n = 0L;
        this.f88718o = 0L;
        this.f88719p = false;
    }

    @Override // yads.bl
    public final boolean isActive() {
        return this.f88709f.f97641a != -1 && (Math.abs(this.f88706c - 1.0f) >= 1.0E-4f || Math.abs(this.f88707d - 1.0f) >= 1.0E-4f || this.f88709f.f97641a != this.f88708e.f97641a);
    }

    @Override // yads.bl
    public final boolean isEnded() {
        c23 c23Var;
        return this.f88719p && ((c23Var = this.f88713j) == null || (c23Var.f88296m * c23Var.f88285b) * 2 == 0);
    }

    @Override // yads.bl
    public final void reset() {
        this.f88706c = 1.0f;
        this.f88707d = 1.0f;
        zk zkVar = zk.f97640e;
        this.f88708e = zkVar;
        this.f88709f = zkVar;
        this.f88710g = zkVar;
        this.f88711h = zkVar;
        ByteBuffer byteBuffer = bl.f88040a;
        this.f88714k = byteBuffer;
        this.f88715l = byteBuffer.asShortBuffer();
        this.f88716m = byteBuffer;
        this.f88705b = -1;
        this.f88712i = false;
        this.f88713j = null;
        this.f88717n = 0L;
        this.f88718o = 0L;
        this.f88719p = false;
    }
}
