package com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt;

import android.content.Context;
import com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class lh {
    public static final ConcurrentHashMap<String, vt> ouw = new ConcurrentHashMap<>();

    public static synchronized void ouw(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, ouw.InterfaceC0167ouw interfaceC0167ouw) {
        if (lhVar == null) {
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt(" url、dir and hash is must property   in VideoInfoModel");
            return;
        }
        ConcurrentHashMap<String, vt> concurrentHashMap = ouw;
        final vt vtVar = concurrentHashMap.get(lhVar.bly());
        if (vtVar == null) {
            vtVar = new vt(context, lhVar);
            concurrentHashMap.put(lhVar.bly(), vtVar);
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(lhVar.lh()), lhVar.bly());
        }
        if (vtVar.f11322le) {
            synchronized (ouw.InterfaceC0167ouw.class) {
                vtVar.fkw.add(interfaceC0167ouw);
            }
        } else {
            vtVar.fkw.add(interfaceC0167ouw);
            if (vtVar.yu.exists() || (!vtVar.ouw.fkw() && (vtVar.f11323lh.length() >= ((long) vtVar.ouw.lh()) || (vtVar.ouw.vt() > 0 && vtVar.f11323lh.length() >= ((long) vtVar.ouw.vt()))))) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", "Cache file is exist");
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2 = vtVar.ouw;
                lhVar2.zin = 1;
                vtVar.ouw(lhVar2, 200);
                ouw(vtVar.ouw);
            } else {
                vtVar.f11322le = true;
                vtVar.ouw.zin = 0;
                cf.ouw ouwVarVt = com.bykv.vk.openvk.ouw.ouw.ouw.lh.yu() != null ? com.bykv.vk.openvk.ouw.ouw.ouw.lh.yu().vt() : new cf.ouw((byte) 0);
                long j10 = vtVar.ouw.f11278vm;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ouwVarVt.ouw(j10, timeUnit).vt(vtVar.ouw.f11277th, timeUnit).lh(vtVar.ouw.qbp, timeUnit);
                cf cfVarOuw = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVarVt);
                ryl.ouw ouwVar = new ryl.ouw();
                final long length = vtVar.f11323lh.length();
                int iLh = vtVar.ouw.lh();
                boolean zFkw = vtVar.ouw.fkw();
                int iVt = vtVar.ouw.vt();
                if (iVt > 0) {
                    if (iVt >= vtVar.ouw.yu()) {
                        zFkw = true;
                    } else {
                        iLh = iVt;
                    }
                }
                ouwVar.pno = "videoPreload";
                ouwVar.f12824ra = 6;
                if (zFkw) {
                    ouwVar.ouw("RANGE", "bytes=" + length + "-").ouw(vtVar.ouw.pno()).ouw("GET", (mwh) null).ouw();
                } else {
                    ouwVar.ouw("RANGE", "bytes=" + length + "-" + iLh).ouw(vtVar.ouw.pno()).ouw("GET", (mwh) null).ouw();
                }
                cfVarOuw.ouw(ouwVar.ouw()).ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.1
                    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(5:121|4|(3:126|6|7)(14:12|117|13|(1:21)(4:16|111|17|18)|(3:119|23|24)(5:109|29|130|30|(4:31|(2:33|(1:128)(6:39|125|40|(1:46)(1:45)|(2:48|135)(1:136)|49))(1:134)|67|71))|28|113|92|123|93|97|(1:99)|100|101)|8|9)(10:78|107|79|80|105|81|82|83|8|9)|91|113|92|123|93|97|(0)|100|101|8|9|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
                    
                        r0 = r1;
                        com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.ouw(r0, r0.ouw, r25.ouw());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x0108, code lost:
                    
                        com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.ouw(r7);
                        com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.ouw(r6);
                        com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.ouw(r14);
                        com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.ouw(r25);
                        r0 = new java.lang.Object[4];
                        r0[r13] = "Pre finally ";
                        r0[1] = r1.ouw.pno();
                        r0[2] = r16;
                        r0[3] = java.lang.Integer.valueOf(r1.ouw.lh());
                        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoPreload", r0);
                        r0 = r1.ouw;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:50:0x0176, code lost:
                    
                        r8 = r14;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x017f, code lost:
                    
                        if (r1.ouw.fkw() == false) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x018b, code lost:
                    
                        if (r17 != r1.f11323lh.length()) goto L65;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x018d, code lost:
                    
                        r0 = r1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:56:0x0197, code lost:
                    
                        if (r0.f11323lh.renameTo(r0.yu) == false) goto L58;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:59:0x01be, code lost:
                    
                        throw new java.io.IOException("Error renaming file " + r0.f11323lh + " to " + r0.yu + " for completion!");
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bf, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cd, code lost:
                    
                        r0 = r1;
                        r0.ouw(r0.ouw, r25.ouw());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d8, code lost:
                    
                        r19 = r6;
                        r5 = r7;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:95:0x025a, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:96:0x025b, code lost:
                    
                        r0.printStackTrace();
                     */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x0264 A[Catch: all -> 0x02a5, TryCatch #4 {all -> 0x02a5, blocks: (B:92:0x024a, B:97:0x025e, B:99:0x0264, B:100:0x0268, B:96:0x025b, B:93:0x024f), top: B:113:0x024a, inners: #9 }] */
                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void ouw(com.bytedance.sdk.component.vt.ouw.jg r25) throws java.io.IOException {
                        /*
                            Method dump skipped, instruction units count: 734
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt.vt.AnonymousClass1.ouw(com.bytedance.sdk.component.vt.ouw.jg):void");
                    }

                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    public final void ouw(IOException iOException) {
                        vt vtVar2 = vt.this;
                        vt.ouw(vtVar2, vtVar2.ouw, 601, iOException.getMessage());
                        lh.ouw(vt.this.ouw);
                    }
                });
            }
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(lhVar.lh()), lhVar.bly());
    }

    public static synchronized void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        vt vtVarRemove = ouw.remove(lhVar.bly());
        if (vtVarRemove != null) {
            vtVarRemove.vt = true;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(lhVar.lh()), lhVar.bly());
    }
}
