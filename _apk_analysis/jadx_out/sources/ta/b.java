package ta;

import ab.j;
import ab.l;
import android.database.Cursor;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.util.List;
import ra.s;
import ra.t;
import ra.u;
import ra.v;

/* JADX INFO: compiled from: LocalMediaLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends ta.a {

    /* JADX INFO: compiled from: LocalMediaLoader.java */
    public class a extends PictureThreadUtils.d<List<LocalMediaFolder>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f85210i;

        public a(t tVar) {
            this.f85210i = tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0159 A[DONT_GENERATE] */
        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> g() {
            /*
                Method dump skipped, instruction units count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ta.b.a.g():java.util.List");
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(List<LocalMediaFolder> list) {
            PictureThreadUtils.d(this);
            t tVar = this.f85210i;
            if (tVar != null) {
                tVar.a(list);
            }
        }
    }

    /* JADX INFO: renamed from: ta.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalMediaLoader.java */
    public class C1062b extends PictureThreadUtils.d<LocalMediaFolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s f85212i;

        public C1062b(s sVar) {
            this.f85212i = sVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder g() {
            return e.b(b.this.getContext(), b.this.a().Z);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(LocalMediaFolder localMediaFolder) {
            PictureThreadUtils.d(this);
            s sVar = this.f85212i;
            if (sVar != null) {
                sVar.a(localMediaFolder);
            }
        }
    }

    public static String m(String str, String str2, String str3) {
        return "(media_type=?" + str3 + " OR media_type=? AND " + str + ") AND " + str2;
    }

    public static String n(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    public static String o(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    public static String p(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    @Override // ta.a
    public void f(t<LocalMediaFolder> tVar) {
        PictureThreadUtils.h(new a(tVar));
    }

    @Override // ta.a
    public void g(s<LocalMediaFolder> sVar) {
        PictureThreadUtils.h(new C1062b(sVar));
    }

    @Override // ta.a
    public void h(long j10, int i10, int i11, u<LocalMedia> uVar) {
    }

    public final LocalMediaFolder j(String str, String str2, String str3, List<LocalMediaFolder> list) {
        for (LocalMediaFolder localMediaFolder : list) {
            String strH = localMediaFolder.h();
            if (!TextUtils.isEmpty(strH) && TextUtils.equals(strH, str3)) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.q(str3);
        localMediaFolder2.o(str);
        localMediaFolder2.p(str2);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }

    public String k() {
        String strB = b();
        String strC = c();
        String strD = d();
        int i10 = a().f34999b;
        if (i10 == 0) {
            return m(strB, strC, strD);
        }
        if (i10 == 1) {
            return o(strC, strD);
        }
        if (i10 == 2) {
            return p(strB, strD);
        }
        if (i10 != 3) {
            return null;
        }
        return n(strB, strD);
    }

    public String[] l() {
        int i10 = a().f34999b;
        if (i10 == 0) {
            return new String[]{String.valueOf(1), String.valueOf(3)};
        }
        if (i10 == 1) {
            return new String[]{String.valueOf(1)};
        }
        if (i10 == 2) {
            return new String[]{String.valueOf(3)};
        }
        if (i10 != 3) {
            return null;
        }
        return new String[]{String.valueOf(2)};
    }

    public String q() {
        return TextUtils.isEmpty(a().f35002c0) ? "date_modified DESC" : a().f35002c0;
    }

    public LocalMedia r(Cursor cursor, boolean z10) {
        long j10;
        long j11;
        String[] strArr = ta.a.f85206e;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(strArr[0]);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(strArr[1]);
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(strArr[2]);
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(strArr[3]);
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(strArr[4]);
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(strArr[5]);
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(strArr[6]);
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow(strArr[7]);
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow(strArr[8]);
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow(strArr[9]);
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow(strArr[10]);
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow(strArr[11]);
        long j12 = cursor.getLong(columnIndexOrThrow);
        long j13 = cursor.getLong(columnIndexOrThrow11);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String strK = l.e() ? j.k(j12, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = ma.d.r();
        }
        if (string.endsWith("image/*")) {
            string = j.i(string2);
            j10 = j13;
            if (!a().F && ma.d.f(string)) {
                return null;
            }
        } else {
            j10 = j13;
        }
        if (string.endsWith("image/*")) {
            return null;
        }
        if (!a().G && string.startsWith(ma.d.s())) {
            return null;
        }
        if (!a().H && ma.d.e(string)) {
            return null;
        }
        int i10 = cursor.getInt(columnIndexOrThrow4);
        int i11 = cursor.getInt(columnIndexOrThrow5);
        int i12 = cursor.getInt(columnIndexOrThrow12);
        if (i12 == 90 || i12 == 270) {
            i10 = cursor.getInt(columnIndexOrThrow5);
            i11 = cursor.getInt(columnIndexOrThrow4);
        }
        long j14 = cursor.getLong(columnIndexOrThrow6);
        long j15 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        int i13 = i10;
        long j16 = cursor.getLong(columnIndexOrThrow10);
        if (TextUtils.isEmpty(string4)) {
            string4 = ma.d.b(string2);
        }
        if (a().E0 && j15 > 0 && j15 < 1024) {
            return null;
        }
        if (ma.d.i(string) || ma.d.d(string)) {
            if (a().f35033s > 0) {
                j11 = j15;
                if (j14 < a().f35033s) {
                    return null;
                }
            } else {
                j11 = j15;
            }
            if (a().f35031r > 0 && j14 > a().f35031r) {
                return null;
            }
            if (a().E0 && j14 <= 0) {
                return null;
            }
        } else {
            j11 = j15;
        }
        LocalMedia localMediaC = LocalMedia.c();
        localMediaC.i0(j12);
        localMediaC.P(j16);
        localMediaC.p0(strK);
        localMediaC.r0(string2);
        localMediaC.f0(string4);
        localMediaC.o0(string3);
        localMediaC.d0(j14);
        localMediaC.R(a().f34999b);
        localMediaC.k0(string);
        localMediaC.w0(i13);
        localMediaC.h0(i11);
        localMediaC.t0(j11);
        localMediaC.c0(j10);
        v vVar = PictureSelectionConfig.f34988h1;
        if (vVar == null || !vVar.a(localMediaC)) {
            return localMediaC;
        }
        return null;
    }
}
