package vs;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import top.zibin.luban.Checker;

/* JADX INFO: compiled from: Luban.java */
/* JADX INFO: loaded from: classes7.dex */
public class e implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f86170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f86174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f86175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f86176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vs.a f86177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<d> f86178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f86179k;

    /* JADX INFO: compiled from: Luban.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f86180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f86181c;

        public a(Context context, d dVar) {
            this.f86180b = context;
            this.f86181c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.f86179k.sendMessage(e.this.f86179k.obtainMessage(1));
                File fileD = e.this.d(this.f86180b, this.f86181c);
                Message messageObtainMessage = e.this.f86179k.obtainMessage(0);
                messageObtainMessage.arg1 = this.f86181c.getIndex();
                messageObtainMessage.obj = fileD;
                Bundle bundle = new Bundle();
                bundle.putString("source", this.f86181c.getPath());
                messageObtainMessage.setData(bundle);
                e.this.f86179k.sendMessage(messageObtainMessage);
            } catch (Exception unused) {
                Message messageObtainMessage2 = e.this.f86179k.obtainMessage(2);
                messageObtainMessage2.arg1 = this.f86181c.getIndex();
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", this.f86181c.getPath());
                messageObtainMessage2.setData(bundle2);
                e.this.f86179k.sendMessage(messageObtainMessage2);
            }
        }
    }

    /* JADX INFO: compiled from: Luban.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f86183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f86184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86185c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public i f86188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public g f86189g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public h f86190h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public vs.a f86191i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f86186d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f86187e = 100;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List<d> f86192j = new ArrayList();

        /* JADX INFO: compiled from: Luban.java */
        public class a extends vs.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ File f86193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f86194b;

            public a(File file, int i10) {
                this.f86193a = file;
                this.f86194b = i10;
            }

            @Override // vs.c
            public InputStream a() {
                return ws.b.d().f(this.f86193a.getAbsolutePath());
            }

            @Override // vs.d
            public int getIndex() {
                return this.f86194b;
            }

            @Override // vs.d
            public String getPath() {
                return this.f86193a.getAbsolutePath();
            }
        }

        /* JADX INFO: renamed from: vs.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Luban.java */
        public class C1083b extends vs.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f86196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f86197b;

            public C1083b(String str, int i10) {
                this.f86196a = str;
                this.f86197b = i10;
            }

            @Override // vs.c
            public InputStream a() {
                return ws.b.d().f(this.f86196a);
            }

            @Override // vs.d
            public int getIndex() {
                return this.f86197b;
            }

            @Override // vs.d
            public String getPath() {
                return this.f86196a;
            }
        }

        /* JADX INFO: compiled from: Luban.java */
        public class c extends vs.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Uri f86199a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f86200b;

            public c(Uri uri, int i10) {
                this.f86199a = uri;
                this.f86200b = i10;
            }

            @Override // vs.c
            public InputStream a() throws IOException {
                return b.this.f86186d ? ws.b.d().e(b.this.f86183a.getContentResolver(), this.f86199a) : b.this.f86183a.getContentResolver().openInputStream(this.f86199a);
            }

            @Override // vs.d
            public int getIndex() {
                return this.f86200b;
            }

            @Override // vs.d
            public String getPath() {
                return Checker.isContent(this.f86199a.toString()) ? this.f86199a.toString() : this.f86199a.getPath();
            }
        }

        public b(Context context) {
            this.f86183a = context;
        }

        public final e k() {
            return new e(this, null);
        }

        public b l(vs.a aVar) {
            this.f86191i = aVar;
            return this;
        }

        public b m(int i10) {
            this.f86187e = i10;
            return this;
        }

        public void n() {
            k().j(this.f86183a);
        }

        public final b o(Uri uri, int i10) {
            this.f86192j.add(new c(uri, i10));
            return this;
        }

        public final b p(File file, int i10) {
            this.f86192j.add(new a(file, i10));
            return this;
        }

        public final b q(String str, int i10) {
            this.f86192j.add(new C1083b(str, i10));
            return this;
        }

        public <T> b r(List<T> list) {
            int i10 = -1;
            for (T t10 : list) {
                i10++;
                if (t10 instanceof String) {
                    q((String) t10, i10);
                } else if (t10 instanceof File) {
                    p((File) t10, i10);
                } else {
                    if (!(t10 instanceof Uri)) {
                        throw new IllegalArgumentException("Incoming data type exception, it must be String, File, Uri or Bitmap");
                    }
                    o((Uri) t10, i10);
                }
            }
            return this;
        }

        public b s(h hVar) {
            this.f86190h = hVar;
            return this;
        }

        public b t(i iVar) {
            this.f86188f = iVar;
            return this;
        }
    }

    public e(b bVar) {
        this.f86170b = bVar.f86184b;
        this.f86171c = bVar.f86185c;
        this.f86172d = bVar.f86186d;
        this.f86174f = bVar.f86188f;
        this.f86178j = bVar.f86192j;
        this.f86175g = bVar.f86189g;
        this.f86176h = bVar.f86190h;
        this.f86173e = bVar.f86187e;
        this.f86177i = bVar.f86191i;
        this.f86179k = new Handler(Looper.getMainLooper(), this);
    }

    public /* synthetic */ e(b bVar, a aVar) {
        this(bVar);
    }

    public static File g(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            if (Log.isLoggable("Luban", 6)) {
                Log.e("Luban", "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(externalCacheDir, str);
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    public static b k(Context context) {
        return new b(context);
    }

    public final File d(Context context, d dVar) throws IOException {
        try {
            return e(context, dVar);
        } finally {
            dVar.close();
        }
    }

    public final File e(Context context, d dVar) throws IOException {
        Checker checker = Checker.SINGLE;
        File fileH = h(context, checker.extSuffix(dVar));
        String strB = Checker.isContent(dVar.getPath()) ? f.b(context, Uri.parse(dVar.getPath())) : dVar.getPath();
        i iVar = this.f86174f;
        if (iVar != null) {
            fileH = i(context, iVar.a(strB));
        }
        vs.a aVar = this.f86177i;
        return aVar != null ? (aVar.a(strB) && checker.needCompress(this.f86173e, strB)) ? new vs.b(dVar, fileH, this.f86171c).a() : new File(strB) : checker.needCompress(this.f86173e, strB) ? new vs.b(dVar, fileH, this.f86171c).a() : new File(strB);
    }

    public final File f(Context context) {
        return g(context, "luban_disk_cache");
    }

    public final File h(Context context, String str) {
        if (TextUtils.isEmpty(this.f86170b)) {
            this.f86170b = f(context).getAbsolutePath();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f86170b);
        sb2.append("/");
        sb2.append(System.currentTimeMillis());
        sb2.append((int) (Math.random() * 1000.0d));
        if (TextUtils.isEmpty(str)) {
            str = ".jpg";
        }
        sb2.append(str);
        return new File(sb2.toString());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            g gVar = this.f86175g;
            if (gVar != null) {
                gVar.a(message.arg1, (File) message.obj);
            }
            h hVar = this.f86176h;
            if (hVar == null) {
                return false;
            }
            hVar.a(message.getData().getString("source"), (File) message.obj);
            return false;
        }
        if (i10 == 1) {
            g gVar2 = this.f86175g;
            if (gVar2 != null) {
                gVar2.onStart();
            }
            h hVar2 = this.f86176h;
            if (hVar2 == null) {
                return false;
            }
            hVar2.onStart();
            return false;
        }
        if (i10 != 2) {
            return false;
        }
        g gVar3 = this.f86175g;
        if (gVar3 != null) {
            gVar3.b(message.arg1, (Throwable) message.obj);
        }
        h hVar3 = this.f86176h;
        if (hVar3 == null) {
            return false;
        }
        hVar3.b(message.getData().getString("source"), (Throwable) message.obj);
        return false;
    }

    public final File i(Context context, String str) {
        if (TextUtils.isEmpty(this.f86170b)) {
            this.f86170b = f(context).getAbsolutePath();
        }
        return new File(this.f86170b + "/" + str);
    }

    public final void j(Context context) {
        List<d> list = this.f86178j;
        if (list != null && list.size() != 0) {
            Iterator<d> it = this.f86178j.iterator();
            while (it.hasNext()) {
                AsyncTask.SERIAL_EXECUTOR.execute(new a(context, it.next()));
                it.remove();
            }
            return;
        }
        g gVar = this.f86175g;
        if (gVar != null) {
            gVar.b(-1, new NullPointerException("image file cannot be null"));
        }
        h hVar = this.f86176h;
        if (hVar != null) {
            hVar.b("", new NullPointerException("image file cannot be null"));
        }
    }
}
