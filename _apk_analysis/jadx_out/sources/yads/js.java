package yads;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class js implements ks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f91338a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f91339b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f91340c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f91341d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk f91342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public iq2 f91344g;

    public js(File file) {
        this.f91342e = new gk(file);
    }

    public static int a(hs hsVar, int i10) {
        int iHashCode = hsVar.f90521b.hashCode() + (hsVar.f90520a * 31);
        if (i10 >= 2) {
            return (iHashCode * 31) + hsVar.f90524e.hashCode();
        }
        long jA = qz.a(hsVar.f90524e);
        return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
    }

    public static hs a(int i10, DataInputStream dataInputStream) throws IOException {
        jc0 jc0VarA;
        int i11 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i10 < 2) {
            long j10 = dataInputStream.readLong();
            rz rzVar = new rz();
            rzVar.f94650a.put("exo_len", Long.valueOf(j10));
            rzVar.f94651b.remove("exo_len");
            jc0VarA = jc0.f91151c.a(rzVar);
        } else {
            jc0VarA = ls.a(dataInputStream);
        }
        return new hs(i11, utf, jc0VarA);
    }

    @Override // yads.ks
    public final void a(long j10) {
    }

    @Override // yads.ks
    public final void a(HashMap map) throws Throwable {
        if (this.f91343f) {
            b(map);
        }
    }

    @Override // yads.ks
    public final void a(HashMap map, SparseArray sparseArray) throws Throwable {
        if (!(!this.f91343f)) {
            throw new IllegalStateException();
        }
        gk gkVar = this.f91342e;
        if (gkVar.f90014a.exists() || gkVar.f90015b.exists()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f91342e.a());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 < 0 || i10 > 2) {
                        ib3.a((Closeable) dataInputStream2);
                    } else {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f91339b == null) {
                                ib3.a((Closeable) dataInputStream2);
                            } else {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    Cipher cipher = this.f91339b;
                                    SecretKeySpec secretKeySpec = this.f91340c;
                                    int i11 = ib3.f90737a;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f91339b));
                                } catch (InvalidAlgorithmParameterException e10) {
                                    e = e10;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e11) {
                                    e = e11;
                                    throw new IllegalStateException(e);
                                }
                            }
                        } else if (this.f91338a) {
                            this.f91343f = true;
                        }
                        int i12 = dataInputStream2.readInt();
                        int iA = 0;
                        for (int i13 = 0; i13 < i12; i13++) {
                            hs hsVarA = a(i10, dataInputStream2);
                            map.put(hsVarA.f90521b, hsVarA);
                            sparseArray.put(hsVarA.f90520a, hsVarA.f90521b);
                            iA += a(hsVarA, i10);
                        }
                        int i14 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i14 == iA && z10) {
                            ib3.a((Closeable) dataInputStream2);
                            return;
                        }
                        ib3.a((Closeable) dataInputStream2);
                    }
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        ib3.a((Closeable) dataInputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        ib3.a((Closeable) dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            gk gkVar2 = this.f91342e;
            gkVar2.f90014a.delete();
            gkVar2.f90015b.delete();
        }
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.f91343f = true;
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z10) {
        this.f91343f = true;
    }

    @Override // yads.ks
    public final boolean a() {
        gk gkVar = this.f91342e;
        return gkVar.f90014a.exists() || gkVar.f90015b.exists();
    }

    @Override // yads.ks
    public final void b() {
        gk gkVar = this.f91342e;
        gkVar.f90014a.delete();
        gkVar.f90015b.delete();
    }

    @Override // yads.ks
    public final void b(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        iq2 iq2Var;
        DataOutputStream dataOutputStream2 = null;
        try {
            fk fkVarB = this.f91342e.b();
            iq2 iq2Var2 = this.f91344g;
            if (iq2Var2 == null) {
                this.f91344g = new iq2(fkVarB);
            } else {
                iq2Var2.a(fkVarB);
            }
            iq2Var = this.f91344g;
            dataOutputStream = new DataOutputStream(iq2Var);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.f91338a ? 1 : 0);
            if (this.f91338a) {
                byte[] bArr = new byte[16];
                SecureRandom secureRandom = this.f91341d;
                int i10 = ib3.f90737a;
                secureRandom.nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.f91339b.init(1, this.f91340c, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(iq2Var, this.f91339b));
                } catch (InvalidAlgorithmParameterException e10) {
                    e = e10;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e11) {
                    e = e11;
                    throw new IllegalStateException(e);
                }
            }
            try {
                dataOutputStream.writeInt(map.size());
                int iA = 0;
                for (hs hsVar : map.values()) {
                    dataOutputStream.writeInt(hsVar.f90520a);
                    dataOutputStream.writeUTF(hsVar.f90521b);
                    Set<Map.Entry> setEntrySet = hsVar.f90524e.f91153b.entrySet();
                    dataOutputStream.writeInt(setEntrySet.size());
                    for (Map.Entry entry : setEntrySet) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        byte[] bArr2 = (byte[]) entry.getValue();
                        dataOutputStream.writeInt(bArr2.length);
                        dataOutputStream.write(bArr2);
                    }
                    iA += a(hsVar, 2);
                }
                dataOutputStream.writeInt(iA);
                gk gkVar = this.f91342e;
                gkVar.getClass();
                dataOutputStream.close();
                gkVar.f90015b.delete();
                int i11 = ib3.f90737a;
                this.f91343f = false;
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream2 = dataOutputStream;
                dataOutputStream = dataOutputStream2;
                ib3.a((Closeable) dataOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            ib3.a((Closeable) dataOutputStream);
            throw th;
        }
    }
}
