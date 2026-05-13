package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.internal.c;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.b;
import com.iab.omid.library.unity3d.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f24800l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24802b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.weakreference.a f24804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24805e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24811k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f24803c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24806f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24807g = false;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f24802b = adSessionConfiguration;
        this.f24801a = adSessionContext;
        String string = UUID.randomUUID().toString();
        this.f24808h = string;
        d(null);
        this.f24805e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.unity3d.publisher.a(string, adSessionContext.getWebView()) : new b(string, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24805e.i();
        c.c().a(this);
        this.f24805e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f24809i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f24800l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e b(View view) {
        for (e eVar : this.f24803c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void b() {
        if (this.f24810j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f24804d.clear();
            }
        }
    }

    private void d(View view) {
        this.f24804d = new com.iab.omid.library.unity3d.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.unity3d.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.unity3d.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24811k.onPossibleObstructionsDetected(this.f24808h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24810j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f24807g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f24803c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f24804d.get();
    }

    public List<e> d() {
        return this.f24803c;
    }

    public boolean e() {
        return this.f24811k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24807g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f24806f && !this.f24807g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f24807g) {
            return;
        }
        this.f24804d.clear();
        removeAllFriendlyObstructions();
        this.f24807g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f24805e = null;
        this.f24811k = null;
    }

    public boolean g() {
        return this.f24807g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f24808h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24805e;
    }

    public boolean h() {
        return this.f24802b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24802b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f24806f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f24809i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f24810j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24807g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24807g) {
            return;
        }
        this.f24803c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24807g) {
            return;
        }
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f24803c.remove(eVarB);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24811k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f24806f) {
            return;
        }
        this.f24806f = true;
        c.c().c(this);
        this.f24805e.a(h.c().b());
        this.f24805e.a(com.iab.omid.library.unity3d.internal.a.a().b());
        this.f24805e.a(this, this.f24801a);
    }
}
