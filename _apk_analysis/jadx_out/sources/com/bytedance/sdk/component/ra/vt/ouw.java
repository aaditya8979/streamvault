package com.bytedance.sdk.component.ra.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public volatile boolean f12778lh;
    public File ouw;
    public File vt;

    public ouw(cf cfVar) {
        super(cfVar);
    }

    public static boolean lh(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public static boolean ouw(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    public static long vt(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.ra.vt.lh
    public final void lh() {
        this.f12778lh = true;
        super.lh();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x022f, code lost:
    
        if (r27.vt.exists() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0239, code lost:
    
        if (r27.vt.length() != r12) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0243, code lost:
    
        if (r27.vt.renameTo(r27.ouw) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0245, code lost:
    
        r15.f12775ra = r27.ouw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0249, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024d, code lost:
    
        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0258, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025c, code lost:
    
        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0269, code lost:
    
        r0 = new java.lang.StringBuilder(" tempFile.length() == fileSize is");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0278, code lost:
    
        if (r27.vt.length() != r12) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x027a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x027d, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027e, code lost:
    
        r0.append(r15);
        com.bytedance.sdk.component.ra.lh.yu.ouw(r24, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x028a, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028e, code lost:
    
        com.bytedance.sdk.component.ra.lh.yu.ouw("Error occured when calling InputStream.close");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0208, code lost:
    
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020b, code lost:
    
        if (r10 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020d, code lost:
    
        r5.seek(r14);
        r5.write(r0, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0215, code lost:
    
        if (r16 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0219, code lost:
    
        if (r7 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021c, code lost:
    
        r12 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021f, code lost:
    
        r12 = r27.vt.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0227, code lost:
    
        if (r12 <= 0) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0208 A[EDGE_INSN: B:201:0x0208->B:88:0x0208 BREAK  A[LOOP:1: B:72:0x01c3->B:85:0x01fb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0 A[Catch: all -> 0x029b, TryCatch #13 {all -> 0x029b, blocks: (B:66:0x01ac, B:68:0x01b2, B:70:0x01b6, B:71:0x01bc, B:72:0x01c3, B:74:0x01d0, B:76:0x01e0, B:81:0x01eb, B:83:0x01f7, B:86:0x0200, B:87:0x0207, B:90:0x020d, B:100:0x0229, B:102:0x0231, B:104:0x023b, B:106:0x0245, B:122:0x0269, B:126:0x027e, B:97:0x021f), top: B:193:0x01ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.component.ra.vt ouw() {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ra.vt.ouw.ouw():com.bytedance.sdk.component.ra.vt");
    }

    public final void ouw(final com.bytedance.sdk.component.ra.ouw.ouw ouwVar) {
        File file = this.ouw;
        if (file == null || this.vt == null) {
            ouwVar.ouw(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
            return;
        }
        if (file.exists() && this.ouw.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.ra.vt vtVar = new com.bytedance.sdk.component.ra.vt(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            vtVar.f12775ra = this.ouw;
            ouwVar.ouw(this, vtVar);
            return;
        }
        long length = this.vt.length();
        final long j10 = length >= 0 ? length : 0L;
        ryl.ouw ouwVar2 = new ryl.ouw();
        ouwVar2.fkw = yu();
        vt(Command.HTTP_HEADER_RANGE, "bytes=" + j10 + "-");
        if (TextUtils.isEmpty(this.bly)) {
            ouwVar.ouw(this, new IOException("Url is Empty"));
            return;
        }
        try {
            ouwVar2.ouw(this.bly);
            if (!TextUtils.isEmpty(this.f12776le)) {
                ouwVar2.pno = this.f12776le;
            }
            int i10 = this.f12777ra;
            if (i10 > 0) {
                ouwVar2.f12824ra = i10;
            }
            ouw(ouwVar2);
            com.bytedance.sdk.component.vt.ouw.vt vtVarOuw = this.yu.ouw(ouwVar2.ouw("GET", (mwh) null).ouw());
            if (vtVarOuw == null) {
                ouwVar.ouw(this, new IOException("new call error"));
            } else {
                vtVarOuw.ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bytedance.sdk.component.ra.vt.ouw.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:117:0x0257 A[Catch: all -> 0x026d, TRY_LEAVE, TryCatch #5 {all -> 0x026d, blocks: (B:115:0x023d, B:117:0x0257), top: B:147:0x023d }] */
                    /* JADX WARN: Removed duplicated region for block: B:138:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:168:0x01a3 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
                    /* JADX WARN: Type inference failed for: r13v2 */
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
                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void ouw(com.bytedance.sdk.component.vt.ouw.jg r22) throws java.io.IOException {
                        /*
                            Method dump skipped, instruction units count: 648
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ra.vt.ouw.AnonymousClass1.ouw(com.bytedance.sdk.component.vt.ouw.jg):void");
                    }

                    @Override // com.bytedance.sdk.component.vt.ouw.lh
                    public final void ouw(IOException iOException) {
                        com.bytedance.sdk.component.ra.ouw.ouw ouwVar3 = ouwVar;
                        if (ouwVar3 != null) {
                            ouwVar3.ouw(ouw.this, iOException);
                        }
                        ouw.this.vt();
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            ouwVar.ouw(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    public final void ouw(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.ouw = new File(str, str2);
        this.vt = new File(str, str2 + ".temp");
    }

    public final void vt() {
        try {
            this.ouw.delete();
        } catch (Throwable unused) {
        }
        try {
            this.vt.delete();
        } catch (Throwable unused2) {
        }
    }
}
