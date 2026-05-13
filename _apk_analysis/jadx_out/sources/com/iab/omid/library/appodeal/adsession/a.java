package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.internal.c;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.internal.f;
import com.iab.omid.library.appodeal.internal.i;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;
import com.iab.omid.library.appodeal.publisher.b;
import com.iab.omid.library.appodeal.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f23868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f23869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f23870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.weakreference.a f23871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f23872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f23878k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23870c = new f();
        this.f23873f = false;
        this.f23874g = false;
        this.f23869b = adSessionConfiguration;
        this.f23868a = adSessionContext;
        this.f23875h = str;
        b(null);
        this.f23872e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.appodeal.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23872e.i();
        c.c().a(this);
        this.f23872e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f23876i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f23871d.clear();
            }
        }
    }

    private void b() {
        if (this.f23877j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f23871d = new com.iab.omid.library.appodeal.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.appodeal.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.appodeal.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23878k.onPossibleObstructionsDetected(this.f23875h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f23877j = true;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f23874g) {
            return;
        }
        this.f23870c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f23875h;
    }

    public AdSessionStatePublisher d() {
        return this.f23872e;
    }

    public View e() {
        return this.f23871d.get();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23874g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f23870c.a();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void finish() {
        if (this.f23874g) {
            return;
        }
        this.f23871d.clear();
        removeAllFriendlyObstructions();
        this.f23874g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f23872e = null;
        this.f23878k = null;
    }

    public boolean g() {
        return this.f23878k != null;
    }

    public boolean h() {
        return this.f23873f && !this.f23874g;
    }

    public boolean i() {
        return this.f23874g;
    }

    public boolean j() {
        return this.f23869b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f23869b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f23873f;
    }

    public void m() {
        a();
        d().g();
        this.f23876i = true;
    }

    public void n() {
        b();
        d().h();
        this.f23877j = true;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f23874g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23874g) {
            return;
        }
        this.f23870c.b();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23874g) {
            return;
        }
        this.f23870c.c(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23878k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void start() {
        if (this.f23873f || this.f23872e == null) {
            return;
        }
        this.f23873f = true;
        c.c().c(this);
        this.f23872e.a(i.c().b());
        this.f23872e.a(com.iab.omid.library.appodeal.internal.a.a().b());
        this.f23872e.a(this, this.f23868a);
    }
}
