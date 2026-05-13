package sq;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.servlet.ServletException;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;

/* JADX INFO: compiled from: MultiPartInputStream.java */
/* JADX INFO: loaded from: classes9.dex */
public class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vq.c f84512h = vq.b.a(l.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zm.g f84513i = new zm.g(System.getProperty("java.io.tmpdir"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f84514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zm.g f84515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MultiMap<String> f84517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f84518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public File f84519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84520g;

    /* JADX INFO: compiled from: MultiPartInputStream.java */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 < 0 || i10 != 61) {
                return i10;
            }
            int i11 = ((FilterInputStream) this).in.read();
            int i12 = ((FilterInputStream) this).in.read();
            if (i11 < 0 || i12 < 0) {
                throw new IOException("Unexpected end to quoted-printable byte");
            }
            return Integer.parseInt(new String(new char[]{(char) i11, (char) i12}), 16);
        }
    }

    /* JADX INFO: compiled from: MultiPartInputStream.java */
    public static class b extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f84522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f84523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f84524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f84525e;

        public b(n nVar) {
            this.f84522b = nVar;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] bArr = this.f84524d;
            if (bArr == null || this.f84525e >= bArr.length) {
                String strD = this.f84522b.d();
                this.f84523c = strD;
                if (strD == null) {
                    return -1;
                }
                if (strD.startsWith("--")) {
                    this.f84524d = (this.f84523c + "\r\n").getBytes();
                } else if (this.f84523c.length() == 0) {
                    this.f84524d = "\r\n".getBytes();
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((this.f84523c.length() * 4) / 3) + 2);
                    d.b(this.f84523c, byteArrayOutputStream);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    this.f84524d = byteArrayOutputStream.toByteArray();
                }
                this.f84525e = 0;
            }
            byte[] bArr2 = this.f84524d;
            int i10 = this.f84525e;
            this.f84525e = i10 + 1;
            return bArr2[i10];
        }
    }

    /* JADX INFO: compiled from: MultiPartInputStream.java */
    public class c implements an.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f84526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f84527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File f84528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public OutputStream f84529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g f84530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f84531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public MultiMap<String> f84532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f84533h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f84534i = true;

        public c(String str, String str2) throws IOException {
            this.f84526a = str;
            this.f84527b = str2;
        }

        public void a() throws IOException {
            File file;
            if (this.f84534i && (file = this.f84528c) != null && file.exists()) {
                this.f84528c.delete();
            }
        }

        public void b() throws IOException {
            this.f84529d.close();
        }

        public void c() throws IOException {
            OutputStream outputStream;
            File fileCreateTempFile = File.createTempFile("MultiPart", "", l.this.f84518e);
            this.f84528c = fileCreateTempFile;
            fileCreateTempFile.setReadable(false, false);
            this.f84528c.setReadable(true, true);
            if (l.this.f84520g) {
                this.f84528c.deleteOnExit();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f84528c));
            if (this.f84533h > 0 && (outputStream = this.f84529d) != null) {
                outputStream.flush();
                this.f84530e.writeTo(bufferedOutputStream);
                this.f84529d.close();
                this.f84530e = null;
            }
            this.f84529d = bufferedOutputStream;
        }

        public String d() {
            return this.f84527b;
        }

        @Override // an.m
        public void delete() throws IOException {
            File file = this.f84528c;
            if (file == null || !file.exists()) {
                return;
            }
            this.f84528c.delete();
        }

        public String e() {
            return this.f84531f;
        }

        public InputStream f() throws IOException {
            return this.f84528c != null ? new BufferedInputStream(new FileInputStream(this.f84528c)) : new ByteArrayInputStream(this.f84530e.d(), 0, this.f84530e.size());
        }

        public String g() {
            return this.f84526a;
        }

        public void h() throws IOException {
            String str = this.f84527b;
            if (str != null && str.trim().length() > 0) {
                c();
                return;
            }
            g gVar = new g();
            this.f84530e = gVar;
            this.f84529d = gVar;
        }

        public void i(String str) {
            this.f84531f = str;
        }

        public void j(MultiMap<String> multiMap) {
            this.f84532g = multiMap;
        }

        public void k(int i10) throws IOException {
            if (l.this.f84515b.c() > 0 && this.f84533h + 1 > l.this.f84515b.c()) {
                throw new IllegalStateException("Multipart Mime part " + this.f84526a + " exceeds max filesize");
            }
            if (l.this.f84515b.a() > 0 && this.f84533h + 1 > l.this.f84515b.a() && this.f84528c == null) {
                c();
            }
            this.f84529d.write(i10);
            this.f84533h++;
        }

        public void l(byte[] bArr, int i10, int i11) throws IOException {
            if (l.this.f84515b.c() > 0 && this.f84533h + ((long) i11) > l.this.f84515b.c()) {
                throw new IllegalStateException("Multipart Mime part " + this.f84526a + " exceeds max filesize");
            }
            if (l.this.f84515b.a() > 0 && this.f84533h + ((long) i11) > l.this.f84515b.a() && this.f84528c == null) {
                c();
            }
            this.f84529d.write(bArr, i10, i11);
            this.f84533h += (long) i11;
        }
    }

    public l(InputStream inputStream, String str, zm.g gVar, File file) {
        this.f84514a = new n(inputStream);
        this.f84516c = str;
        this.f84515b = gVar;
        this.f84519f = file;
        if (file == null) {
            this.f84519f = new File(System.getProperty("java.io.tmpdir"));
        }
        if (this.f84515b == null) {
            this.f84515b = new zm.g(this.f84519f.getAbsolutePath());
        }
    }

    public void a() throws MultiException {
        Collection<an.m> collectionC = c();
        MultiException multiException = new MultiException();
        Iterator<an.m> it = collectionC.iterator();
        while (it.hasNext()) {
            try {
                ((c) it.next()).a();
            } catch (Exception e10) {
                multiException.add(e10);
            }
        }
        this.f84517d.clear();
        multiException.ifExceptionThrowMulti();
    }

    public final String b(String str) {
        String strTrim = str.substring(str.indexOf(61) + 1).trim();
        if (!strTrim.matches(".??[a-z,A-Z]\\:\\\\[^\\\\].*")) {
            return m.h(strTrim, true);
        }
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '\"' || cCharAt == '\'') {
            strTrim = strTrim.substring(1);
        }
        char cCharAt2 = strTrim.charAt(strTrim.length() - 1);
        return (cCharAt2 == '\"' || cCharAt2 == '\'') ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    public Collection<an.m> c() {
        MultiMap<String> multiMap = this.f84517d;
        if (multiMap == null) {
            return Collections.emptyList();
        }
        Collection<Object> collectionValues = multiMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.addAll(LazyList.getList(it.next(), false));
        }
        return arrayList;
    }

    public Collection<an.m> d() throws ServletException, IOException {
        e();
        Collection<Object> collectionValues = this.f84517d.values();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.addAll(LazyList.getList(it.next(), false));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0210, code lost:
    
        if (r5 >= r6.length) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0214, code lost:
    
        if (r15 != r6[r5]) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0216, code lost:
    
        r5 = r5 + 1;
        r4 = -2;
        r12 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021b, code lost:
    
        if (r7 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
    
        r3.k(13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0222, code lost:
    
        if (r14 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0224, code lost:
    
        r3.k(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0227, code lost:
    
        if (r5 <= 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0229, code lost:
    
        r3.l(r6, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022d, code lost:
    
        r3.k(r15);
        r5 = -1;
        r4 = -2;
        r7 = false;
        r12 = -2;
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0236, code lost:
    
        if (r15 != r12) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0238, code lost:
    
        r2.mark(1);
        r12 = r2.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0240, code lost:
    
        if (r12 == 10) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0242, code lost:
    
        r2.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0245, code lost:
    
        r12 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0246, code lost:
    
        if (r5 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024b, code lost:
    
        if (r5 < (r6.length - 2)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024e, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0251, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0256, code lost:
    
        if (r5 != (r6.length - 1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0258, code lost:
    
        if (r7 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025a, code lost:
    
        r3.k(13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025f, code lost:
    
        if (r14 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0261, code lost:
    
        r3.k(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0264, code lost:
    
        r3.l(r6, 0, r5);
        r5 = -1;
        r7 = false;
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026b, code lost:
    
        if (r5 > 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026e, code lost:
    
        if (r15 != (-1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0271, code lost:
    
        if (r7 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0273, code lost:
    
        r3.k(13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0278, code lost:
    
        if (r14 == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x027a, code lost:
    
        r3.k(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027f, code lost:
    
        if (r15 != 13) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0281, code lost:
    
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0284, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0285, code lost:
    
        if (r15 == 10) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0287, code lost:
    
        if (r12 != 10) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x028a, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x028c, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028e, code lost:
    
        if (r12 != 10) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0290, code lost:
    
        r12 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0291, code lost:
    
        r4 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0295, code lost:
    
        if (r5 != r6.length) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0297, code lost:
    
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0299, code lost:
    
        r3.b();
        r3 = r20;
        r5 = r21;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a5, code lost:
    
        r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b0, code lost:
    
        throw new java.io.IOException("Missing content-disposition");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r13 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        r12 = new sq.m(r13, r4, r7, r5);
        r16 = r7;
        r7 = null;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        if (r12.hasMoreTokens() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        r5 = r12.nextToken().trim();
        r20 = r3;
        r3 = r5.toLowerCase(java.util.Locale.ENGLISH);
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0149, code lost:
    
        if (r5.startsWith("form-data") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0154, code lost:
    
        if (r3.startsWith("name=") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        r13 = f(r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
    
        if (r3.startsWith("filename=") == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        r7 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016a, code lost:
    
        r3 = r20;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0170, code lost:
    
        r20 = r3;
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0174, code lost:
    
        if (r16 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0177, code lost:
    
        if (r13 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0179, code lost:
    
        r3 = r20;
        r4 = r22;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017e, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
    
        r3 = new sq.l.c(r25, r13, r7);
        r3.j(r2);
        r3.i(r14);
        r25.f84517d.add(r13, r3);
        r3.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if ("base64".equalsIgnoreCase(r15) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        r2 = new sq.l.b((sq.n) r25.f84514a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ab, code lost:
    
        if ("quoted-printable".equalsIgnoreCase(r15) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
    
        r2 = new sq.l.a(r25, r25.f84514a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b5, code lost:
    
        r2 = r25.f84514a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b7, code lost:
    
        r4 = -2;
        r12 = -2;
        r5 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bb, code lost:
    
        r14 = r7;
        r7 = r5;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bf, code lost:
    
        if (r12 == r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        r15 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        r15 = r2.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        if (r15 == (-1)) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cb, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d9, code lost:
    
        if (r25.f84515b.d() <= 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e3, code lost:
    
        if (r10 > r25.f84515b.d()) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0203, code lost:
    
        throw new java.lang.IllegalStateException("Request exceeds maxRequestSize (" + r25.f84515b.d() + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0204, code lost:
    
        r12 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0206, code lost:
    
        if (r15 == 13) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0208, code lost:
    
        if (r15 != 10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020a, code lost:
    
        r12 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020d, code lost:
    
        if (r5 < 0) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() throws javax.servlet.ServletException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sq.l.e():void");
    }

    public final String f(String str, boolean z10) {
        return m.g(str.substring(str.indexOf(61) + 1).trim());
    }
}
