package ta;

import ab.j;
import ab.k;
import ab.l;
import ab.o;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ra.s;
import ra.t;
import ra.u;
import ra.v;

/* JADX INFO: compiled from: LocalMediaPageLoader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends ta.a {

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class a extends PictureThreadUtils.d<pa.a> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f85214i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f85215j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f85216k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u f85217l;

        public a(long j10, int i10, int i11, u uVar) {
            this.f85214i = j10;
            this.f85215j = i10;
            this.f85216k = i11;
            this.f85217l = uVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public pa.a g() {
            String strG;
            ArrayList<LocalMedia> arrayListA;
            Cursor cursorQuery = null;
            try {
                try {
                    boolean z10 = true;
                    if (l.f()) {
                        String strT = d.this.t(this.f85214i);
                        String[] strArrU = d.this.u(this.f85214i);
                        int i10 = this.f85215j;
                        cursorQuery = d.this.getContext().getContentResolver().query(ta.a.f85205d, ta.a.f85206e, j.a(strT, strArrU, i10, (this.f85216k - 1) * i10, d.this.G()), null);
                    } else {
                        if (this.f85216k == -1) {
                            strG = d.this.G();
                        } else {
                            strG = d.this.G() + " limit " + this.f85215j + " offset " + ((this.f85216k - 1) * this.f85215j);
                        }
                        cursorQuery = d.this.getContext().getContentResolver().query(ta.a.f85205d, ta.a.f85206e, d.this.t(this.f85214i), d.this.u(this.f85214i), strG);
                    }
                    if (cursorQuery == null) {
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return new pa.a();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToFirst();
                        do {
                            LocalMedia localMediaI = d.this.I(cursorQuery, false);
                            if (localMediaI != null) {
                                arrayList.add(localMediaI);
                            }
                        } while (cursorQuery.moveToNext());
                    }
                    if (this.f85214i == -1 && this.f85216k == 1 && (arrayListA = e.a(d.this.getContext(), d.this.a().Z)) != null) {
                        arrayList.addAll(arrayListA);
                        o.f(arrayList);
                    }
                    if (cursorQuery.getCount() <= 0) {
                        z10 = false;
                    }
                    pa.a aVar = new pa.a(z10, arrayList);
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return aVar;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Log.i(ta.a.f85204c, "loadMedia Page Data Error: " + e10.getMessage());
                    pa.a aVar2 = new pa.a();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return aVar2;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(pa.a aVar) {
            PictureThreadUtils.d(this);
            u uVar = this.f85217l;
            if (uVar != null) {
                ArrayList<LocalMedia> arrayList = aVar.f77155b;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                uVar.a(arrayList, aVar.f77154a);
            }
        }
    }

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class b extends PictureThreadUtils.d<LocalMediaFolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s f85219i;

        public b(s sVar) {
            this.f85219i = sVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder g() {
            return e.b(d.this.getContext(), d.this.a().Z);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(LocalMediaFolder localMediaFolder) {
            PictureThreadUtils.d(this);
            s sVar = this.f85219i;
            if (sVar != null) {
                sVar.a(localMediaFolder);
            }
        }
    }

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class c extends PictureThreadUtils.d<List<LocalMediaFolder>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f85221i;

        public c(t tVar) {
            this.f85221i = tVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<LocalMediaFolder> g() {
            int count;
            ArrayList<LocalMediaFolder> arrayList;
            int i10;
            String string;
            Context context;
            int i11;
            Cursor cursorQuery = d.this.getContext().getContentResolver().query(ta.a.f85205d, d.this.H() ? ta.a.f85206e : ta.a.f85207f, d.this.z(), d.this.A(), d.this.G());
            if (cursorQuery != null) {
                try {
                    try {
                        count = cursorQuery.getCount();
                        arrayList = new ArrayList();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Log.i(ta.a.f85204c, "loadAllMedia Data Error: " + e10.getMessage());
                        if (!cursorQuery.isClosed()) {
                        }
                        return new ArrayList();
                    }
                    if (count > 0) {
                        String str = "bucket_id";
                        String str2 = "mime_type";
                        if (d.this.H()) {
                            HashMap map = new HashMap();
                            HashSet hashSet = new HashSet();
                            while (cursorQuery.moveToNext()) {
                                if (d.this.a().F0) {
                                    LocalMedia localMediaI = d.this.I(cursorQuery, true);
                                    if (localMediaI != null) {
                                        localMediaI.O();
                                    }
                                }
                                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(str));
                                Long l10 = (Long) map.get(Long.valueOf(j10));
                                map.put(Long.valueOf(j10), l10 == null ? 1L : Long.valueOf(l10.longValue() + 1));
                                if (!hashSet.contains(Long.valueOf(j10))) {
                                    LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                                    localMediaFolder.l(j10);
                                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str2));
                                    if (map.containsKey(Long.valueOf(j10))) {
                                        long jLongValue = ((Long) map.get(Long.valueOf(j10))).longValue();
                                        String str3 = str;
                                        long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                                        localMediaFolder.q(string2);
                                        localMediaFolder.r(ab.s.c(Long.valueOf(jLongValue)));
                                        localMediaFolder.o(j.k(j11, string3));
                                        localMediaFolder.p(string3);
                                        arrayList.add(localMediaFolder);
                                        hashSet.add(Long.valueOf(j10));
                                        str = str3;
                                        str2 = str2;
                                    }
                                }
                            }
                            i10 = 0;
                            for (LocalMediaFolder localMediaFolder2 : arrayList) {
                                int iC = ab.s.c(map.get(Long.valueOf(localMediaFolder2.c())));
                                localMediaFolder2.r(iC);
                                i10 += iC;
                            }
                        } else {
                            String str4 = "bucket_id";
                            String str5 = "mime_type";
                            cursorQuery.moveToFirst();
                            int i12 = 0;
                            while (true) {
                                String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                String string5 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                String str6 = str5;
                                String string6 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str6));
                                String str7 = str4;
                                long j12 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(str7));
                                int i13 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("count"));
                                LocalMediaFolder localMediaFolder3 = new LocalMediaFolder();
                                localMediaFolder3.l(j12);
                                localMediaFolder3.o(string4);
                                localMediaFolder3.q(string5);
                                localMediaFolder3.p(string6);
                                localMediaFolder3.r(i13);
                                arrayList.add(localMediaFolder3);
                                i12 += i13;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str5 = str6;
                                str4 = str7;
                            }
                            i10 = i12;
                        }
                        LocalMediaFolder localMediaFolder4 = new LocalMediaFolder();
                        LocalMediaFolder localMediaFolderB = e.b(d.this.getContext(), d.this.a().Z);
                        if (localMediaFolderB != null) {
                            arrayList.add(localMediaFolderB);
                            long jLastModified = new File(localMediaFolderB.f()).lastModified();
                            i10 += localMediaFolderB.i();
                            localMediaFolder4.n(new ArrayList<>());
                            if (cursorQuery.moveToFirst()) {
                                localMediaFolder4.o(l.e() ? d.r(cursorQuery) : d.s(cursorQuery));
                                localMediaFolder4.p(d.q(cursorQuery));
                                if (jLastModified > (ma.d.c(localMediaFolder4.f()) ? new File(k.h(d.this.getContext(), Uri.parse(localMediaFolder4.f()))).lastModified() : new File(localMediaFolder4.f()).lastModified())) {
                                    localMediaFolder4.o(localMediaFolderB.f());
                                    localMediaFolder4.p(localMediaFolderB.g());
                                }
                            }
                        } else if (cursorQuery.moveToFirst()) {
                            localMediaFolder4.o(l.e() ? d.r(cursorQuery) : d.s(cursorQuery));
                            localMediaFolder4.p(d.q(cursorQuery));
                        }
                        if (i10 == 0) {
                            return arrayList;
                        }
                        o.e(arrayList);
                        localMediaFolder4.r(i10);
                        localMediaFolder4.l(-1L);
                        if (TextUtils.isEmpty(d.this.a().f35004d0)) {
                            if (d.this.a().f34999b == ma.e.b()) {
                                context = d.this.getContext();
                                i11 = R$string.ps_all_audio;
                            } else {
                                context = d.this.getContext();
                                i11 = R$string.ps_camera_roll;
                            }
                            string = context.getString(i11);
                        } else {
                            string = d.this.a().f35004d0;
                        }
                        localMediaFolder4.q(string);
                        arrayList.add(0, localMediaFolder4);
                        if (d.this.a().f35024n0 && d.this.a().f34999b == ma.e.a()) {
                            d.this.J(arrayList);
                        }
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return arrayList;
                        cursorQuery.close();
                    }
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                } finally {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
            return new ArrayList();
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void m(List<LocalMediaFolder> list) {
            PictureThreadUtils.d(this);
            LocalMedia.d();
            t tVar = this.f85221i;
            if (tVar != null) {
                tVar.a(list);
            }
        }
    }

    public static String[] E(int i10, long j10) {
        return j10 == -1 ? new String[]{String.valueOf(i10)} : new String[]{String.valueOf(i10), ab.s.g(Long.valueOf(j10))};
    }

    public static String q(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
    }

    public static String r(Cursor cursor) {
        return j.k(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
    }

    public static String s(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    public static String v(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    public static String w(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    public static String x(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        if (j10 == -1) {
            sb2.append(str);
            sb2.append(") AND ");
            sb2.append(str2);
            return sb2.toString();
        }
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str2);
        return sb2.toString();
    }

    public static String y(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    public String[] A() {
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

    public final String B(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str3);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append(str2);
        if (H()) {
            return sb2.toString();
        }
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public final String C(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (H()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public final String D(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (H()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public final String F(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (H()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public String G() {
        return TextUtils.isEmpty(a().f35002c0) ? "date_modified DESC" : a().f35002c0;
    }

    public final boolean H() {
        if (l.e()) {
            return true;
        }
        return a().F0;
    }

    public LocalMedia I(Cursor cursor, boolean z10) {
        String str;
        int i10;
        long j10;
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
        long j11 = cursor.getLong(columnIndexOrThrow);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String strK = l.e() ? j.k(j11, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = ma.d.r();
        }
        if (a().f35010g0) {
            if (ma.d.h(string)) {
                if (!TextUtils.isEmpty(string2) && !k.n(string2)) {
                    return null;
                }
            } else if (!k.l(string2)) {
                return null;
            }
        }
        if (string.endsWith("image/*")) {
            string = j.i(string2);
            str = strK;
            if (!a().F && ma.d.f(string)) {
                return null;
            }
        } else {
            str = strK;
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
        int i11 = cursor.getInt(columnIndexOrThrow4);
        int i12 = cursor.getInt(columnIndexOrThrow5);
        int i13 = cursor.getInt(columnIndexOrThrow12);
        if (i13 == 90 || i13 == 270) {
            i10 = cursor.getInt(columnIndexOrThrow5);
            i12 = cursor.getInt(columnIndexOrThrow4);
        } else {
            i10 = i11;
        }
        long j12 = cursor.getLong(columnIndexOrThrow6);
        long j13 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        long j14 = cursor.getLong(columnIndexOrThrow10);
        long j15 = cursor.getLong(columnIndexOrThrow11);
        if (TextUtils.isEmpty(string4)) {
            string4 = ma.d.b(string2);
        }
        if (a().E0 && j13 > 0 && j13 < 1024) {
            return null;
        }
        if (ma.d.i(string) || ma.d.d(string)) {
            if (a().f35033s > 0) {
                j10 = j15;
                if (j12 < a().f35033s) {
                    return null;
                }
            } else {
                j10 = j15;
            }
            if (a().f35031r > 0 && j12 > a().f35031r) {
                return null;
            }
            if (a().E0 && j12 <= 0) {
                return null;
            }
        } else {
            j10 = j15;
        }
        LocalMedia localMediaN = z10 ? LocalMedia.N() : LocalMedia.c();
        localMediaN.i0(j11);
        localMediaN.P(j14);
        localMediaN.p0(str);
        localMediaN.r0(string2);
        localMediaN.f0(string4);
        localMediaN.o0(string3);
        localMediaN.d0(j12);
        localMediaN.R(a().f34999b);
        localMediaN.k0(string);
        localMediaN.w0(i10);
        localMediaN.h0(i12);
        localMediaN.t0(j13);
        localMediaN.c0(j10);
        v vVar = PictureSelectionConfig.f34988h1;
        if (vVar == null || !vVar.a(localMediaN)) {
            return localMediaN;
        }
        return null;
    }

    public final void J(List<LocalMediaFolder> list) throws Throwable {
        for (int i10 = 0; i10 < list.size(); i10++) {
            LocalMediaFolder localMediaFolder = list.get(i10);
            if (localMediaFolder != null) {
                String strP = p(localMediaFolder.c());
                if (!TextUtils.isEmpty(strP)) {
                    localMediaFolder.o(strP);
                }
            }
        }
    }

    @Override // ta.a
    public void f(t<LocalMediaFolder> tVar) {
        PictureThreadUtils.h(new c(tVar));
    }

    @Override // ta.a
    public void g(s<LocalMediaFolder> sVar) {
        PictureThreadUtils.h(new b(sVar));
    }

    @Override // ta.a
    public void h(long j10, int i10, int i11, u<LocalMedia> uVar) {
        PictureThreadUtils.h(new a(j10, i11, i10, uVar));
    }

    public String p(long j10) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2 = null;
        try {
            if (l.f()) {
                cursorQuery = getContext().getContentResolver().query(ta.a.f85205d, new String[]{"_id", "mime_type", "_data"}, j.a(t(j10), u(j10), 1, 0, G()), null);
            } else {
                cursorQuery = getContext().getContentResolver().query(ta.a.f85205d, new String[]{"_id", "mime_type", "_data"}, t(j10), u(j10), G() + " limit 1 offset 0");
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        if (!cursorQuery.moveToFirst()) {
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                        String strK = l.e() ? j.k(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"))) : cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return strK;
                    }
                } catch (Exception e10) {
                    cursor = cursorQuery;
                    e = e10;
                    try {
                        e.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    cursor2 = cursorQuery;
                    th = th3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
        return null;
    }

    public final String t(long j10) {
        String strB = b();
        String strC = c();
        String strD = d();
        int i10 = a().f34999b;
        if (i10 == 0) {
            return v(j10, strD, strB, strC);
        }
        if (i10 == 1) {
            return x(j10, strD, strC);
        }
        if (i10 == 2) {
            return y(j10, strD, strB, strC);
        }
        if (i10 != 3) {
            return null;
        }
        return w(j10, strD, strB, strC);
    }

    public final String[] u(long j10) {
        int i10 = a().f34999b;
        if (i10 == 0) {
            return j10 == -1 ? new String[]{String.valueOf(1), String.valueOf(3)} : new String[]{String.valueOf(1), String.valueOf(3), ab.s.g(Long.valueOf(j10))};
        }
        if (i10 == 1) {
            return E(1, j10);
        }
        if (i10 == 2) {
            return E(3, j10);
        }
        if (i10 != 3) {
            return null;
        }
        return E(2, j10);
    }

    public String z() {
        String strB = b();
        String strC = c();
        String strD = d();
        int i10 = a().f34999b;
        if (i10 == 0) {
            return B(strB, strC, strD);
        }
        if (i10 == 1) {
            return D(strC, strD);
        }
        if (i10 == 2) {
            return F(strB, strD);
        }
        if (i10 != 3) {
            return null;
        }
        return C(strB, strD);
    }
}
