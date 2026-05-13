package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f24126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f24127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24134k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f24126c = new f();
        this.f24129f = false;
        this.f24130g = false;
        this.f24125b = adSessionConfiguration;
        this.f24124a = adSessionContext;
        this.f24131h = str;
        b(null);
        this.f24128e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24128e.i();
        c.c().a(this);
        this.f24128e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f24132i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f24127d.clear();
            }
        }
    }

    private void b() {
        if (this.f24133j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(View view) {
        this.f24127d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24134k.onPossibleObstructionsDetected(this.f24131h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24133j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f24130g) {
            return;
        }
        this.f24126c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f24127d.get();
    }

    public List<e> d() {
        return this.f24126c.a();
    }

    public boolean e() {
        return this.f24134k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24130g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f24129f && !this.f24130g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f24130g) {
            return;
        }
        this.f24127d.clear();
        removeAllFriendlyObstructions();
        this.f24130g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f24128e = null;
        this.f24134k = null;
    }

    public boolean g() {
        return this.f24130g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f24131h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24128e;
    }

    public boolean h() {
        return this.f24125b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24125b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f24129f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f24132i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f24133j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24130g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24130g) {
            return;
        }
        this.f24126c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24130g) {
            return;
        }
        this.f24126c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24134k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f24129f) {
            return;
        }
        this.f24129f = true;
        c.c().c(this);
        this.f24128e.a(i.c().b());
        this.f24128e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f24128e.a(this, this.f24124a);
    }
}
