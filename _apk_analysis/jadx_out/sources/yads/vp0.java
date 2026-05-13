package yads;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class vp0 implements s43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p20 f96152a = new p20();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w43 f96153b = new w43();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f96154c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96156e;

    public vp0() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f96154c.addFirst(new tp0(this));
        }
        this.f96155d = 0;
    }

    @Override // yads.oa0
    public final Object a() {
        if (!(!this.f96156e)) {
            throw new IllegalStateException();
        }
        if (this.f96155d != 2 || this.f96154c.isEmpty()) {
            return null;
        }
        x43 x43Var = (x43) this.f96154c.removeFirst();
        if (this.f96153b.b(4)) {
            x43Var.f94912b |= 4;
        } else {
            w43 w43Var = this.f96153b;
            long j10 = w43Var.f94751f;
            p20 p20Var = this.f96152a;
            ByteBuffer byteBuffer = w43Var.f94749d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            p20Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            up0 up0Var = new up0(j10, yq.a(o20.f93084t, parcelableArrayList));
            x43Var.f95584c = this.f96153b.f94751f;
            x43Var.f96631d = up0Var;
            x43Var.f96632e = 0L;
        }
        this.f96153b.b();
        this.f96155d = 0;
        return x43Var;
    }

    @Override // yads.s43
    public final void a(long j10) {
    }

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        if (!(!this.f96156e)) {
            throw new IllegalStateException();
        }
        if (this.f96155d != 1) {
            throw new IllegalStateException();
        }
        if (this.f96153b != w43Var) {
            throw new IllegalArgumentException();
        }
        this.f96155d = 2;
    }

    public final void a(x43 x43Var) {
        if (this.f96154c.size() >= 2) {
            throw new IllegalStateException();
        }
        if (!(!this.f96154c.contains(x43Var))) {
            throw new IllegalArgumentException();
        }
        x43Var.f94912b = 0;
        x43Var.f96631d = null;
        this.f96154c.addFirst(x43Var);
    }

    @Override // yads.oa0
    public final Object b() {
        if (!(!this.f96156e)) {
            throw new IllegalStateException();
        }
        if (this.f96155d != 0) {
            return null;
        }
        this.f96155d = 1;
        return this.f96153b;
    }

    @Override // yads.oa0
    public final void flush() {
        if (!(!this.f96156e)) {
            throw new IllegalStateException();
        }
        this.f96153b.b();
        this.f96155d = 0;
    }

    @Override // yads.oa0
    public final void release() {
        this.f96156e = true;
    }
}
