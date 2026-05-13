package z5;

import a6.k0;
import a6.y;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer.database.DatabaseIOException;
import com.ironsource.Z7;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: CachedContentIndex.java */
/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, g> f98216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<String> f98217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f98218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f98219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f98220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c f98221f;

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f98222e = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h4.a f98223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<g> f98224b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f98225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f98226d;

        public a(h4.a aVar) {
            this.f98223a = aVar;
        }

        public static void delete(h4.a aVar, long j10) throws DatabaseIOException {
            delete(aVar, Long.toHexString(j10));
        }

        private static void delete(h4.a aVar, String str) throws DatabaseIOException {
            try {
                String strG = g(str);
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    h4.c.c(writableDatabase, 1, str);
                    e(writableDatabase, strG);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        public static void e(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String g(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // z5.h.c
        public void a(g gVar, boolean z10) {
            if (z10) {
                this.f98224b.delete(gVar.f98211a);
            } else {
                this.f98224b.put(gVar.f98211a, null);
            }
        }

        @Override // z5.h.c
        public void b(g gVar) {
            this.f98224b.put(gVar.f98211a, gVar);
        }

        public final void c(SQLiteDatabase sQLiteDatabase, g gVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            h.t(gVar.c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(gVar.f98211a));
            contentValues.put("key", gVar.f98212b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow(this.f98226d, null, contentValues);
        }

        public final void d(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete(this.f98226d, "id = ?", new String[]{Integer.toString(i10)});
        }

        @Override // z5.h.c
        public void delete() throws DatabaseIOException {
            delete(this.f98223a, this.f98225c);
        }

        @Override // z5.h.c
        public boolean exists() throws DatabaseIOException {
            return h4.c.b(this.f98223a.getReadableDatabase(), 1, this.f98225c) != -1;
        }

        public final Cursor f() {
            return this.f98223a.getReadableDatabase().query(this.f98226d, f98222e, null, null, null, null, null);
        }

        public final void h(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            h4.c.d(sQLiteDatabase, 1, this.f98225c, 1);
            e(sQLiteDatabase, this.f98226d);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f98226d + Z7.f30794r + "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // z5.h.c
        public void initialize(long j10) {
            String hexString = Long.toHexString(j10);
            this.f98225c = hexString;
            this.f98226d = g(hexString);
        }

        @Override // z5.h.c
        public void load(HashMap<String, g> map, SparseArray<String> sparseArray) throws IOException {
            a6.a.f(this.f98224b.size() == 0);
            try {
                if (h4.c.b(this.f98223a.getReadableDatabase(), 1, this.f98225c) != 1) {
                    SQLiteDatabase writableDatabase = this.f98223a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        h(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorF = f();
                while (cursorF.moveToNext()) {
                    try {
                        g gVar = new g(cursorF.getInt(0), cursorF.getString(1), h.q(new DataInputStream(new ByteArrayInputStream(cursorF.getBlob(2)))));
                        map.put(gVar.f98212b, gVar);
                        sparseArray.put(gVar.f98211a, gVar.f98212b);
                    } finally {
                    }
                }
                cursorF.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e10);
            }
        }

        @Override // z5.h.c
        public void storeFully(HashMap<String, g> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f98223a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    h(writableDatabase);
                    Iterator<g> it = map.values().iterator();
                    while (it.hasNext()) {
                        c(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f98224b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // z5.h.c
        public void storeIncremental(HashMap<String, g> map) throws IOException {
            if (this.f98224b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f98223a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f98224b.size(); i10++) {
                    try {
                        g gVarValueAt = this.f98224b.valueAt(i10);
                        if (gVarValueAt == null) {
                            d(writableDatabase, this.f98224b.keyAt(i10));
                        } else {
                            c(writableDatabase, gVarValueAt);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f98224b.clear();
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Cipher f98228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final SecretKeySpec f98229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Random f98230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a6.b f98231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f98232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public y f98233g;

        public b(File file, @Nullable byte[] bArr, boolean z10) {
            Cipher cipherI;
            SecretKeySpec secretKeySpec;
            if (bArr != null) {
                a6.a.a(bArr.length == 16);
                try {
                    cipherI = h.i();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                a6.a.a(!z10);
                cipherI = null;
                secretKeySpec = null;
            }
            this.f98227a = z10;
            this.f98228b = cipherI;
            this.f98229c = secretKeySpec;
            this.f98230d = z10 ? new Random() : null;
            this.f98231e = new a6.b(file);
        }

        @Override // z5.h.c
        public void a(g gVar, boolean z10) {
            this.f98232f = true;
        }

        @Override // z5.h.c
        public void b(g gVar) {
            this.f98232f = true;
        }

        public final int c(g gVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (gVar.f98211a * 31) + gVar.f98212b.hashCode();
            if (i10 < 2) {
                long jA = i.a(gVar.c());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (jA ^ (jA >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = gVar.c().hashCode();
            }
            return i11 + iHashCode;
        }

        public final g d(int i10, DataInputStream dataInputStream) throws IOException {
            k kVarQ;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 < 2) {
                long j10 = dataInputStream.readLong();
                j jVar = new j();
                j.g(jVar, j10);
                kVarQ = k.f98236c.e(jVar);
            } else {
                kVarQ = h.q(dataInputStream);
            }
            return new g(i11, utf, kVarQ);
        }

        @Override // z5.h.c
        public void delete() {
            this.f98231e.delete();
        }

        public final boolean e(HashMap<String, g> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f98231e.b()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f98231e.c());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f98228b == null) {
                                k0.n(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f98228b.init(2, this.f98229c, new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f98228b));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f98227a) {
                            this.f98232f = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int iC = 0;
                        for (int i12 = 0; i12 < i11; i12++) {
                            g gVarD = d(i10, dataInputStream2);
                            map.put(gVarD.f98212b, gVarD);
                            sparseArray.put(gVarD.f98211a, gVarD.f98212b);
                            iC += c(gVarD, i10);
                        }
                        int i13 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i13 == iC && z10) {
                            k0.n(dataInputStream2);
                            return true;
                        }
                        k0.n(dataInputStream2);
                        return false;
                    }
                    k0.n(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        k0.n(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        k0.n(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // z5.h.c
        public boolean exists() {
            return this.f98231e.b();
        }

        public final void f(g gVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(gVar.f98211a);
            dataOutputStream.writeUTF(gVar.f98212b);
            h.t(gVar.c(), dataOutputStream);
        }

        public final void g(HashMap<String, g> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamE = this.f98231e.e();
                y yVar = this.f98233g;
                if (yVar == null) {
                    this.f98233g = new y(outputStreamE);
                } else {
                    yVar.a(outputStreamE);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.f98233g);
                try {
                    dataOutputStream2.writeInt(2);
                    int iC = 0;
                    dataOutputStream2.writeInt(this.f98227a ? 1 : 0);
                    if (this.f98227a) {
                        byte[] bArr = new byte[16];
                        this.f98230d.nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            this.f98228b.init(1, this.f98229c, new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f98233g, this.f98228b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (g gVar : map.values()) {
                        f(gVar, dataOutputStream2);
                        iC += c(gVar, 2);
                    }
                    dataOutputStream2.writeInt(iC);
                    this.f98231e.a(dataOutputStream2);
                    k0.n(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    k0.n(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // z5.h.c
        public void initialize(long j10) {
        }

        @Override // z5.h.c
        public void load(HashMap<String, g> map, SparseArray<String> sparseArray) {
            a6.a.f(!this.f98232f);
            if (e(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f98231e.delete();
        }

        @Override // z5.h.c
        public void storeFully(HashMap<String, g> map) throws Throwable {
            g(map);
            this.f98232f = false;
        }

        @Override // z5.h.c
        public void storeIncremental(HashMap<String, g> map) throws Throwable {
            if (this.f98232f) {
                storeFully(map);
            }
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public interface c {
        void a(g gVar, boolean z10);

        void b(g gVar);

        void delete() throws IOException;

        boolean exists() throws IOException;

        void initialize(long j10);

        void load(HashMap<String, g> map, SparseArray<String> sparseArray) throws IOException;

        void storeFully(HashMap<String, g> map) throws IOException;

        void storeIncremental(HashMap<String, g> map) throws IOException;
    }

    public h(@Nullable h4.a aVar, @Nullable File file, @Nullable byte[] bArr, boolean z10, boolean z11) {
        a6.a.f((aVar == null && file == null) ? false : true);
        this.f98216a = new HashMap<>();
        this.f98217b = new SparseArray<>();
        this.f98218c = new SparseBooleanArray();
        this.f98219d = new SparseBooleanArray();
        a aVar2 = aVar != null ? new a(aVar) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : null;
        if (aVar2 == null || (bVar != null && z11)) {
            this.f98220e = bVar;
            this.f98221f = aVar2;
        } else {
            this.f98220e = aVar2;
            this.f98221f = bVar;
        }
    }

    @WorkerThread
    public static void delete(h4.a aVar, long j10) throws DatabaseIOException {
        a.delete(aVar, j10);
    }

    @SuppressLint({"GetInstance"})
    public static Cipher i() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (k0.f3574a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    @VisibleForTesting
    public static int l(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public static k q(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException("Invalid value size: " + i12);
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = k0.f3579f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new k(map);
    }

    public static void t(k kVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setF = kVar.f();
        dataOutputStream.writeInt(setF.size());
        for (Map.Entry<String, byte[]> entry : setF) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final g d(String str) {
        int iL = l(this.f98217b);
        g gVar = new g(iL, str);
        this.f98216a.put(str, gVar);
        this.f98217b.put(iL, str);
        this.f98219d.put(iL, true);
        this.f98220e.b(gVar);
        return gVar;
    }

    public void e(String str, j jVar) {
        g gVarM = m(str);
        if (gVarM.b(jVar)) {
            this.f98220e.b(gVarM);
        }
    }

    public int f(String str) {
        return m(str).f98211a;
    }

    public g g(String str) {
        return this.f98216a.get(str);
    }

    public Collection<g> h() {
        return this.f98216a.values();
    }

    public i j(String str) {
        g gVarG = g(str);
        return gVarG != null ? gVarG.c() : k.f98236c;
    }

    public String k(int i10) {
        return this.f98217b.get(i10);
    }

    public g m(String str) {
        g gVar = this.f98216a.get(str);
        return gVar == null ? d(str) : gVar;
    }

    @WorkerThread
    public void n(long j10) throws IOException {
        c cVar;
        this.f98220e.initialize(j10);
        c cVar2 = this.f98221f;
        if (cVar2 != null) {
            cVar2.initialize(j10);
        }
        if (this.f98220e.exists() || (cVar = this.f98221f) == null || !cVar.exists()) {
            this.f98220e.load(this.f98216a, this.f98217b);
        } else {
            this.f98221f.load(this.f98216a, this.f98217b);
            this.f98220e.storeFully(this.f98216a);
        }
        c cVar3 = this.f98221f;
        if (cVar3 != null) {
            cVar3.delete();
            this.f98221f = null;
        }
    }

    public void p(String str) {
        g gVar = this.f98216a.get(str);
        if (gVar == null || !gVar.f() || gVar.g()) {
            return;
        }
        this.f98216a.remove(str);
        int i10 = gVar.f98211a;
        boolean z10 = this.f98219d.get(i10);
        this.f98220e.a(gVar, z10);
        if (z10) {
            this.f98217b.remove(i10);
            this.f98219d.delete(i10);
        } else {
            this.f98217b.put(i10, null);
            this.f98218c.put(i10, true);
        }
    }

    public void r() {
        int size = this.f98216a.size();
        String[] strArr = new String[size];
        this.f98216a.keySet().toArray(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            p(strArr[i10]);
        }
    }

    @WorkerThread
    public void s() throws IOException {
        this.f98220e.storeIncremental(this.f98216a);
        int size = this.f98218c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f98217b.remove(this.f98218c.keyAt(i10));
        }
        this.f98218c.clear();
        this.f98219d.clear();
    }
}
