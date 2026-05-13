package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.c f18650c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f18654g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cipher f18651d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SecretKeySpec f18652e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18648a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f18649b = new SparseArray();

    public i(File file) {
        this.f18650c = new com.fyber.inneractive.sdk.player.exoplayer2.util.c(new File(file, "cached_content_index.exi"));
    }

    public final h a(String str, long j10) {
        SparseArray sparseArray = this.f18649b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        h hVar = new h(iKeyAt, str, j10);
        this.f18648a.put(str, hVar);
        this.f18649b.put(iKeyAt, str);
        this.f18653f = true;
        return hVar;
    }

    public final void a() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f18648a.values()) {
            if (hVar.f18646c.isEmpty()) {
                linkedList.add(hVar.f18645b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h hVar2 = (h) this.f18648a.remove((String) it.next());
            if (hVar2 != null) {
                if (!hVar2.f18646c.isEmpty()) {
                    throw new IllegalStateException();
                }
                this.f18649b.remove(hVar2.f18644a);
                this.f18653f = true;
            }
        }
    }

    public final void b() throws Throwable {
        DataOutputStream dataOutputStream;
        IOException e10;
        Throwable th2;
        if (!this.f18653f) {
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.util.b bVarB = this.f18650c.b();
            p pVar = this.f18654g;
            if (pVar == null) {
                this.f18654g = new p(bVarB);
            } else {
                pVar.a(bVarB);
            }
            dataOutputStream = new DataOutputStream(this.f18654g);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.f18651d != null ? 1 : 0);
                if (this.f18651d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f18651d.init(1, this.f18652e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f18654g, this.f18651d));
                    } catch (InvalidAlgorithmParameterException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e12) {
                        e = e12;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f18648a.size());
                int i10 = 0;
                for (h hVar : this.f18648a.values()) {
                    dataOutputStream2.writeInt(hVar.f18644a);
                    dataOutputStream2.writeUTF(hVar.f18645b);
                    dataOutputStream2.writeLong(hVar.f18647d);
                    int iHashCode = (hVar.f18645b.hashCode() + (hVar.f18644a * 31)) * 31;
                    long j10 = hVar.f18647d;
                    i10 += iHashCode + ((int) (j10 ^ (j10 >>> 32)));
                }
                dataOutputStream2.writeInt(i10);
                com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = this.f18650c;
                cVar.getClass();
                dataOutputStream2.close();
                cVar.f18763b.delete();
                int i11 = z.f18822a;
                this.f18653f = false;
            } catch (IOException e13) {
                e10 = e13;
                try {
                    throw new a(e10);
                } catch (Throwable th3) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th3;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th4 = th;
                    dataOutputStream = dataOutputStream2;
                    th2 = th4;
                    z.a(dataOutputStream);
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                z.a(dataOutputStream);
                throw th2;
            }
        } catch (IOException e14) {
            dataOutputStream = dataOutputStream2;
            e10 = e14;
        } catch (Throwable th6) {
            th = th6;
            Throwable th42 = th;
            dataOutputStream = dataOutputStream2;
            th2 = th42;
            z.a(dataOutputStream);
            throw th2;
        }
    }
}
