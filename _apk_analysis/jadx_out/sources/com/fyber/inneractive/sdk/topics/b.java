package com.fyber.inneractive.sdk.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.r;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19441b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f19446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GetTopicsRequest f19447h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19442c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f19443d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f19444e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f19445f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f19448i = new AtomicBoolean(false);

    public final JSONArray a() {
        JSONObject jSONObject;
        if (this.f19444e.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (EncryptedTopic encryptedTopic : this.f19444e) {
            if (!IAConfigManager.c()) {
                jSONObject = null;
            } else if (this.f19442c.containsKey(encryptedTopic)) {
                jSONObject = (JSONObject) this.f19442c.get(encryptedTopic);
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
                    jSONObject2.put("et", encryptedTopic2 == null ? null : Base64.encodeToString(encryptedTopic2, 10));
                    jSONObject2.put("ki", encryptedTopic.getKeyIdentifier());
                    byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
                    jSONObject2.put("ek", encapsulatedKey == null ? null : Base64.encodeToString(encapsulatedKey, 10));
                    this.f19442c.put(encryptedTopic, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertEncryptedTopicToJSON called", e10, IAlog.a(this));
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f19448i.compareAndSet(false, true)) {
            this.f19440a = z10;
            this.f19441b = z11;
            GetTopicsRequest.Builder builder = new GetTopicsRequest.Builder();
            builder.setAdsSdkName(FyberDiscovery.f52087g);
            this.f19447h = builder.build();
            this.f19446g = new a(this);
        }
    }

    public final JSONArray b() {
        JSONObject jSONObject;
        if (this.f19445f.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Topic topic : this.f19445f) {
            if (this.f19443d.containsKey(topic)) {
                jSONObject = (JSONObject) this.f19443d.get(topic);
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", topic.getTopicId());
                    jSONObject2.put("mv", topic.getModelVersion());
                    jSONObject2.put("tv", topic.getTaxonomyVersion());
                    this.f19443d.put(topic, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertTopicToJSON called", e10, IAlog.a(this));
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }

    public final void c() {
        TopicsManager topicsManager;
        Context baseContext = o.f19548a.getBaseContext();
        if (baseContext == null || (topicsManager = (TopicsManager) baseContext.getSystemService(TopicsManager.class)) == null) {
            return;
        }
        topicsManager.getTopics(this.f19447h, r.f19555a, this.f19446g);
    }
}
