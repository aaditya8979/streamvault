package com.iab.omid.library.mmadbridge.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f24787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0354b f24788b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0354b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0354b interfaceC0354b) {
        this.f24788b = interfaceC0354b;
    }

    public void a(a aVar) {
        this.f24787a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f24787a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
