package com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ko;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.ironsource.Z7;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vt implements lh {
    public volatile long bly;
    public long fkw;
    public boolean ouw;
    public final com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public RandomAccessFile f11321ra;
    private File tlj;
    public File yu;
    public volatile long vt = -2147483648L;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Object f11320lh = new Object();

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private volatile long f11318cf = -1;
    private volatile int ryl = -100;
    private volatile boolean mwh = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile boolean f11319le = false;

    public vt(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        this.fkw = 0L;
        this.f11321ra = null;
        this.pno = lhVar;
        try {
            String str = lhVar.f11272lh;
            String strBly = lhVar.bly();
            this.yu = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(str, strBly);
            File fileVt = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.vt(str, strBly);
            this.tlj = fileVt;
            if (fileVt.exists()) {
                this.f11321ra = new RandomAccessFile(this.tlj, "r");
            } else {
                this.f11321ra = new RandomAccessFile(this.yu, "rw");
            }
            if (!this.tlj.exists()) {
                this.fkw = this.yu.length();
                cf.ouw ouwVarVt = com.bykv.vk.openvk.ouw.ouw.ouw.lh.yu() != null ? com.bykv.vk.openvk.ouw.ouw.ouw.lh.yu().vt() : new cf.ouw((byte) 0);
                long j10 = lhVar.f11278vm;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ouwVarVt.ouw(j10, timeUnit).vt(lhVar.f11277th, timeUnit).lh(lhVar.qbp, timeUnit);
                cf cfVarOuw = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVarVt);
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "RANGE, bytes=", Long.valueOf(this.fkw), " file hash=", lhVar.bly());
                ryl.ouw ouwVarOuw = new ryl.ouw().ouw("RANGE", "bytes=" + this.fkw + "-").ouw(lhVar.pno()).ouw("GET", (mwh) null);
                ouwVarOuw.pno = "videoLoadWhenPlaying";
                ouwVarOuw.f12824ra = 9;
                cfVarOuw.ouw(ouwVarOuw.ouw()).ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.vt.1
                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    public final void ouw(jg jgVar) throws IOException {
                        ko koVarYu;
                        if (jgVar == null) {
                            vt.ouw(vt.this, Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                            return;
                        }
                        InputStream inputStreamLh = null;
                        try {
                            vt.this.f11319le = jgVar.vt();
                            if (vt.this.f11319le) {
                                koVarYu = jgVar.yu();
                                try {
                                    if (vt.this.f11319le && koVarYu != null) {
                                        vt.this.vt = koVarYu.ouw() + vt.this.fkw;
                                        inputStreamLh = koVarYu.lh();
                                    }
                                    if (inputStreamLh == null) {
                                        vt.ouw(vt.this, Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                        if (inputStreamLh != null) {
                                            try {
                                                inputStreamLh.close();
                                            } catch (Throwable th2) {
                                                th2.printStackTrace();
                                                return;
                                            }
                                        }
                                        if (koVarYu != null) {
                                            koVarYu.close();
                                        }
                                        jgVar.close();
                                        if (vt.this.f11319le && vt.this.yu.length() == vt.this.vt) {
                                            vt.ouw(vt.this);
                                            return;
                                        }
                                        return;
                                    }
                                    int iRa = com.bykv.vk.openvk.ouw.ouw.vt.ouw.ra();
                                    byte[] bArr = new byte[iRa];
                                    vt vtVar = vt.this;
                                    long j11 = vtVar.fkw;
                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "start write, totalLength = ", Long.valueOf(vtVar.vt), " startSaved=", Long.valueOf(vt.this.fkw), " url=", vt.this.pno.pno());
                                    int i10 = 0;
                                    long j12 = 0;
                                    while (true) {
                                        int i11 = inputStreamLh.read(bArr, i10, iRa - i10);
                                        if (i11 == -1) {
                                            break;
                                        }
                                        i10 += i11;
                                        long j13 = j12 + ((long) i11);
                                        boolean z10 = j13 % ((long) iRa) == 0 || j13 == vt.this.vt - vt.this.fkw;
                                        boolean z11 = z10;
                                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "Write segment,execAppend =", Boolean.valueOf(z10), " offset=", Integer.valueOf(i10), " totalLength = ", Long.valueOf(vt.this.vt), " saveSize =", j13 + ", waitingAtPost=", Long.valueOf(vt.this.bly));
                                        if (z11) {
                                            synchronized (vt.this.f11320lh) {
                                                RandomAccessFile randomAccessFile = vt.this.f11321ra;
                                                int iIntValue = Long.valueOf(j11).intValue();
                                                vt.this.pno.bly();
                                                com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(randomAccessFile, bArr, iIntValue, i10);
                                                vt vtVar2 = vt.this;
                                                if (vtVar2.ouw && vtVar2.bly > -1) {
                                                    vt vtVar3 = vt.this;
                                                    if (vtVar3.fkw + j13 >= vtVar3.bly) {
                                                        vt.this.f11320lh.notify();
                                                    }
                                                }
                                            }
                                            j11 += (long) i10;
                                            i10 = 0;
                                        }
                                        j12 = j13;
                                    }
                                    Object[] objArr = new Object[8];
                                    objArr[0] = "Write segment,Write over, startIndex =";
                                    objArr[1] = Long.valueOf(vt.this.fkw);
                                    objArr[2] = " totalLength = ";
                                    objArr[3] = Long.valueOf(vt.this.vt);
                                    objArr[4] = " saveSize = ";
                                    objArr[5] = Long.valueOf(j12);
                                    objArr[6] = " writeEndSegment =";
                                    objArr[7] = Boolean.valueOf(j12 == vt.this.vt - vt.this.fkw);
                                    com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", objArr);
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        vt.ouw(vt.this, Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                        th.printStackTrace();
                                        if (inputStreamLh != null) {
                                            try {
                                                inputStreamLh.close();
                                            } catch (Throwable th4) {
                                                th4.printStackTrace();
                                                return;
                                            }
                                        }
                                        if (koVarYu != null) {
                                            koVarYu.close();
                                        }
                                        jgVar.close();
                                        if (vt.this.f11319le && vt.this.yu.length() == vt.this.vt) {
                                            vt.ouw(vt.this);
                                            return;
                                        }
                                        return;
                                    } finally {
                                    }
                                }
                            } else {
                                vt.ouw(vt.this, jgVar.ouw(), jgVar.lh());
                                koVarYu = null;
                            }
                            if (inputStreamLh != null) {
                                try {
                                    inputStreamLh.close();
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                            }
                            if (koVarYu != null) {
                                koVarYu.close();
                            }
                            jgVar.close();
                            if (vt.this.f11319le && vt.this.yu.length() == vt.this.vt) {
                                vt.ouw(vt.this);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            koVarYu = null;
                        }
                    }

                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    public final void ouw(IOException iOException) {
                        vt.ouw(vt.this, 30000, iOException.getMessage());
                    }
                });
            }
            this.ouw = com.bykv.vk.openvk.ouw.ouw.vt.ouw.le() == 2;
        } catch (Throwable unused) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "Error using file ", lhVar.pno(), " as disc cache");
        }
    }

    public static /* synthetic */ void ouw(vt vtVar) throws IOException {
        synchronized (vtVar.f11320lh) {
            if (vtVar.tlj.exists()) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "complete: isCompleted ", vtVar.pno.pno(), vtVar.pno.bly());
                return;
            }
            try {
            } finally {
            }
            if (vtVar.yu.renameTo(vtVar.tlj)) {
                RandomAccessFile randomAccessFile = vtVar.f11321ra;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                vtVar.f11321ra = new RandomAccessFile(vtVar.tlj, "rw");
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "complete: rename ", vtVar.pno.bly(), vtVar.pno.pno());
                return;
            }
            throw new IOException("Error renaming file " + vtVar.yu + " to " + vtVar.tlj + " for completion!");
        }
    }

    public static /* synthetic */ void ouw(vt vtVar, int i10, String str) {
        JSONObject jSONObject;
        vtVar.f11319le = false;
        vtVar.ryl = i10;
        vtVar.vt = vtVar.f11318cf;
        qbp.vt("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i10), Z7.f30794r, str);
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar = vtVar.pno;
        if (lhVar == null || !lhVar.ouw() || (jSONObject = vtVar.pno.ex) == null) {
            return;
        }
        try {
            jSONObject.put("error_real_code", i10);
            jSONObject.put("error_real_msg", str);
        } catch (Throwable th2) {
            qbp.ouw("CSJ_MediaDLPlay", "handleFailResponse: ", th2);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.lh
    public final int ouw(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            int i12 = -1;
            if (j10 == this.vt) {
                return -1;
            }
            int i13 = 0;
            int i14 = 0;
            while (!this.mwh) {
                synchronized (this.f11320lh) {
                    long length = this.tlj.exists() ? this.tlj.length() : this.yu.length();
                    if (j10 < length) {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "read:  read ", Long.valueOf(j10), " success");
                        this.f11321ra.seek(j10);
                        i14 = this.f11321ra.read(bArr, i10, i11);
                    } else {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "read: wait at ", Long.valueOf(j10), ", file size = ", Long.valueOf(length));
                        i13 += 33;
                        this.bly = j10;
                        this.f11320lh.wait(33L);
                        this.bly = -1L;
                    }
                }
                if (i14 > 0) {
                    return i14;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar = this.pno;
                if (lhVar != null && lhVar.ouw() && this.ryl != -100 && (!this.f11319le || this.vt == this.f11318cf)) {
                    throw new IOException();
                }
                if (i13 >= 20000) {
                    throw new SocketTimeoutException();
                }
                i12 = -1;
            }
            return i12;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.lh
    public final void ouw() {
        try {
            if (!this.mwh) {
                this.f11321ra.close();
            }
            File file = this.yu;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.tlj;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } finally {
        }
        this.mwh = true;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.lh
    public final long vt() throws IOException {
        if (this.tlj.exists()) {
            this.vt = this.tlj.length();
        } else {
            synchronized (this.f11320lh) {
                int i10 = 0;
                while (this.vt == -2147483648L && !this.mwh) {
                    try {
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "totalLength: wait");
                        i10 += 15;
                        this.f11320lh.wait(5L);
                        if (i10 > 20000) {
                            return -1L;
                        }
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                        throw new IOException("total length InterruptException");
                    }
                }
            }
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("CSJ_MediaDLPlay", "totalLength= ", Long.valueOf(this.vt));
        return this.vt;
    }
}
