package aa;

import aa.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ironsource.C3978d4;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import ia.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SqliteDatabaseImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public class d implements aa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f3684a = new e(ia.c.a()).getWritableDatabase();

    /* JADX INFO: compiled from: SqliteDatabaseImpl.java */
    public class a implements a.InterfaceC0001a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<FileDownloadModel> f3685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f3686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<FileDownloadModel> f3687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<List<fa.a>> f3688e;

        public a(d dVar) {
            this(null, null);
        }

        public a(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<fa.a>> sparseArray2) {
            this.f3685b = new SparseArray<>();
            this.f3687d = sparseArray;
            this.f3688e = sparseArray2;
        }

        @Override // aa.a.InterfaceC0001a
        public void b(FileDownloadModel fileDownloadModel) {
            SparseArray<FileDownloadModel> sparseArray = this.f3687d;
            if (sparseArray != null) {
                sparseArray.put(fileDownloadModel.g(), fileDownloadModel);
            }
        }

        @Override // aa.a.InterfaceC0001a
        public void c(FileDownloadModel fileDownloadModel) {
        }

        @Override // aa.a.InterfaceC0001a
        public void d(int i10, FileDownloadModel fileDownloadModel) {
            this.f3685b.put(i10, fileDownloadModel);
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            b bVar = d.this.new b();
            this.f3686c = bVar;
            return bVar;
        }

        @Override // aa.a.InterfaceC0001a
        public void k() {
            b bVar = this.f3686c;
            if (bVar != null) {
                bVar.b();
            }
            int size = this.f3685b.size();
            if (size < 0) {
                return;
            }
            d.this.f3684a.beginTransaction();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    int iKeyAt = this.f3685b.keyAt(i10);
                    FileDownloadModel fileDownloadModel = this.f3685b.get(iKeyAt);
                    d.this.f3684a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(iKeyAt)});
                    d.this.f3684a.insert("filedownloader", null, fileDownloadModel.D());
                    if (fileDownloadModel.c() > 1) {
                        List<fa.a> listM = d.this.m(iKeyAt);
                        if (listM.size() > 0) {
                            d.this.f3684a.delete("filedownloaderConnection", "id = ?", new String[]{String.valueOf(iKeyAt)});
                            for (fa.a aVar : listM) {
                                aVar.i(fileDownloadModel.g());
                                d.this.f3684a.insert("filedownloaderConnection", null, aVar.l());
                            }
                        }
                    }
                } finally {
                    d.this.f3684a.endTransaction();
                }
            }
            SparseArray<FileDownloadModel> sparseArray = this.f3687d;
            if (sparseArray != null && this.f3688e != null) {
                int size2 = sparseArray.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    int iG = this.f3687d.valueAt(i11).g();
                    List<fa.a> listM2 = d.this.m(iG);
                    if (listM2 != null && listM2.size() > 0) {
                        this.f3688e.put(iG, listM2);
                    }
                }
            }
            d.this.f3684a.setTransactionSuccessful();
        }
    }

    /* JADX INFO: compiled from: SqliteDatabaseImpl.java */
    public class b implements Iterator<FileDownloadModel> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cursor f3690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Integer> f3691c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3692d;

        public b() {
            this.f3690b = d.this.f3684a.rawQuery("SELECT * FROM filedownloader", null);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel next() {
            FileDownloadModel fileDownloadModelS = d.s(this.f3690b);
            this.f3692d = fileDownloadModelS.g();
            return fileDownloadModelS;
        }

        public void b() {
            this.f3690b.close();
            if (this.f3691c.isEmpty()) {
                return;
            }
            String strJoin = TextUtils.join(", ", this.f3691c);
            if (ia.d.f64033a) {
                ia.d.a(this, "delete %s", strJoin);
            }
            d.this.f3684a.execSQL(f.o("DELETE FROM %s WHERE %s IN (%s);", "filedownloader", "_id", strJoin));
            d.this.f3684a.execSQL(f.o("DELETE FROM %s WHERE %s IN (%s);", "filedownloaderConnection", "id", strJoin));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3690b.moveToNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f3691c.add(Integer.valueOf(this.f3692d));
        }
    }

    public static FileDownloadModel s(Cursor cursor) {
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        fileDownloadModel.x(cursor.getInt(cursor.getColumnIndex("_id")));
        fileDownloadModel.C(cursor.getString(cursor.getColumnIndex("url")));
        fileDownloadModel.y(cursor.getString(cursor.getColumnIndex("path")), cursor.getShort(cursor.getColumnIndex("pathAsDirectory")) == 1);
        fileDownloadModel.A((byte) cursor.getShort(cursor.getColumnIndex("status")));
        fileDownloadModel.z(cursor.getLong(cursor.getColumnIndex("sofar")));
        fileDownloadModel.B(cursor.getLong(cursor.getColumnIndex(C3978d4.i.f31347l)));
        fileDownloadModel.v(cursor.getString(cursor.getColumnIndex("errMsg")));
        fileDownloadModel.u(cursor.getString(cursor.getColumnIndex(DownloadModel.ETAG)));
        fileDownloadModel.w(cursor.getString(cursor.getColumnIndex("filename")));
        fileDownloadModel.t(cursor.getInt(cursor.getColumnIndex("connectionCount")));
        return fileDownloadModel;
    }

    private void update(int i10, ContentValues contentValues) {
        this.f3684a.update("filedownloader", contentValues, "_id = ? ", new String[]{String.valueOf(i10)});
    }

    @Override // aa.a
    public void a(fa.a aVar) {
        this.f3684a.insert("filedownloaderConnection", null, aVar.l());
    }

    @Override // aa.a
    public void b(int i10, Throwable th2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th2.toString());
        contentValues.put("status", (Byte) (byte) 5);
        update(i10, contentValues);
    }

    @Override // aa.a
    public void c(int i10, String str, long j10, long j11, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sofar", Long.valueOf(j10));
        contentValues.put(C3978d4.i.f31347l, Long.valueOf(j11));
        contentValues.put(DownloadModel.ETAG, str);
        contentValues.put("connectionCount", Integer.valueOf(i11));
        update(i10, contentValues);
    }

    @Override // aa.a
    public void clear() {
        this.f3684a.delete("filedownloader", null, null);
        this.f3684a.delete("filedownloaderConnection", null, null);
    }

    @Override // aa.a
    public void d(int i10, int i11, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentOffset", Long.valueOf(j10));
        this.f3684a.update("filedownloaderConnection", contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i10), Integer.toString(i11)});
    }

    @Override // aa.a
    public void e(int i10) {
        this.f3684a.execSQL("DELETE FROM filedownloaderConnection WHERE id = " + i10);
    }

    @Override // aa.a
    public void f(int i10) {
    }

    @Override // aa.a
    public a.InterfaceC0001a g() {
        return new a(this);
    }

    @Override // aa.a
    public void h(int i10, long j10) {
        remove(i10);
    }

    @Override // aa.a
    public void i(int i10) {
    }

    @Override // aa.a
    public void insert(FileDownloadModel fileDownloadModel) {
        this.f3684a.insert("filedownloader", null, fileDownloadModel.D());
    }

    @Override // aa.a
    public void j(int i10, Throwable th2, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th2.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put("sofar", Long.valueOf(j10));
        update(i10, contentValues);
    }

    @Override // aa.a
    public void k(int i10, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put("sofar", Long.valueOf(j10));
        update(i10, contentValues);
    }

    @Override // aa.a
    public void l(int i10, long j10, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put(C3978d4.i.f31347l, Long.valueOf(j10));
        contentValues.put(DownloadModel.ETAG, str);
        contentValues.put("filename", str2);
        update(i10, contentValues);
    }

    @Override // aa.a
    public List<fa.a> m(int i10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f3684a.rawQuery(f.o("SELECT * FROM %s WHERE %s = ?", "filedownloaderConnection", "id"), new String[]{Integer.toString(i10)});
            while (cursorRawQuery.moveToNext()) {
                fa.a aVar = new fa.a();
                aVar.i(i10);
                aVar.j(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("connectionIndex")));
                aVar.k(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("startOffset")));
                aVar.g(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("currentOffset")));
                aVar.h(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("endOffset")));
                arrayList.add(aVar);
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @Override // aa.a
    public FileDownloadModel n(int i10) throws Throwable {
        Throwable th2;
        Cursor cursorRawQuery;
        try {
            cursorRawQuery = this.f3684a.rawQuery(f.o("SELECT * FROM %s WHERE %s = ?", "filedownloader", "_id"), new String[]{Integer.toString(i10)});
            try {
                if (!cursorRawQuery.moveToNext()) {
                    cursorRawQuery.close();
                    return null;
                }
                FileDownloadModel fileDownloadModelS = s(cursorRawQuery);
                cursorRawQuery.close();
                return fileDownloadModelS;
            } catch (Throwable th3) {
                th2 = th3;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursorRawQuery = null;
        }
    }

    @Override // aa.a
    public void o(int i10, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionCount", Integer.valueOf(i11));
        this.f3684a.update("filedownloader", contentValues, "_id = ? ", new String[]{Integer.toString(i10)});
    }

    @Override // aa.a
    public void p(int i10, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put("sofar", Long.valueOf(j10));
        update(i10, contentValues);
    }

    @Override // aa.a
    public boolean remove(int i10) {
        return this.f3684a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(i10)}) != 0;
    }

    public a.InterfaceC0001a t(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<fa.a>> sparseArray2) {
        return new a(sparseArray, sparseArray2);
    }

    @Override // aa.a
    public void update(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            ia.d.i(this, "update but model == null!", new Object[0]);
        } else if (n(fileDownloadModel.g()) == null) {
            insert(fileDownloadModel);
        } else {
            this.f3684a.update("filedownloader", fileDownloadModel.D(), "_id = ? ", new String[]{String.valueOf(fileDownloadModel.g())});
        }
    }
}
