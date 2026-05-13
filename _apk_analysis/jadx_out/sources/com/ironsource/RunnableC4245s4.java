package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class RunnableC4245s4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f33516a;

    public RunnableC4245s4(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "stringToSend");
        this.f33516a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection uRLConnectionOpenConnection = new URL(C4228r4.d().f33401h).openConnection();
            tn.p.i(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty(com.safedk.android.utils.k.f53181b, G5.L);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
            dataOutputStream.writeBytes(this.f33516a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection)));
            Log.i("MSG", httpURLConnection.getResponseMessage());
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            ironLog.verbose("sent crash report for type " + this.f33516a.get(Z7.f30790n) + " and date " + this.f33516a.get(Z7.f30788l));
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
