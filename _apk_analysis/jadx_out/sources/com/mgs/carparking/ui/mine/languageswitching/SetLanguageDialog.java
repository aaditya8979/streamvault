package com.mgs.carparking.ui.mine.languageswitching;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.os.LocaleListCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.SetLanguageEntry;
import com.mgs.carparking.ui.mine.languageswitching.SetLanguageAdapter;
import com.mgs.carparking.ui.mine.languageswitching.SetLanguageDialog;
import ed.c;
import ed.g;
import ed.l0;
import ed.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import zp.r;

/* JADX INFO: loaded from: classes12.dex */
public class SetLanguageDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f44899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f44900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f44901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<Object> f44903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SetLanguageAdapter f44904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f44905h;

    public class a implements SetLanguageAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f44906a;

        public a(List list) {
            this.f44906a = list;
        }

        @Override // com.mgs.carparking.ui.mine.languageswitching.SetLanguageAdapter.c
        public void a(int i10) {
            SetLanguageDialog.this.f44904g.g(this.f44906a, i10);
            SetLanguageDialog.this.f44902e = ((SetLanguageEntry) this.f44906a.get(i10)).getName();
        }
    }

    public SetLanguageDialog(Context context) {
        super(context, R.style.dialog_center);
        this.f44902e = "";
        this.f44903f = new ArrayList<>();
        requestWindowFeature(1);
        this.f44901d = context;
    }

    public static /* synthetic */ boolean c(SetLanguageEntry setLanguageEntry) {
        return setLanguageEntry.getName().equals(r.d());
    }

    public final void d(View view) {
        this.f44899b = (TextView) view.findViewById(R.id.tv_cancel);
        this.f44900c = (TextView) view.findViewById(R.id.tv_save);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_language);
        this.f44905h = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f44901d));
        List<SetLanguageEntry> listF = f();
        SetLanguageAdapter setLanguageAdapter = new SetLanguageAdapter(this.f44901d, listF);
        this.f44904g = setLanguageAdapter;
        this.f44905h.setAdapter(setLanguageAdapter);
        this.f44904g.f(new a(listF));
        this.f44899b.setOnClickListener(this);
        this.f44900c.setOnClickListener(this);
    }

    public final void e() {
        getWindow().setGravity(17);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public List<SetLanguageEntry> f() {
        ArrayList arrayList = new ArrayList();
        if (Objects.equals(l0.s(), "none")) {
            return new ArrayList();
        }
        String strS = l0.s();
        Objects.requireNonNull(strS);
        for (String str : strS.split(StringUtils.COMMA)) {
            arrayList.add(new SetLanguageEntry(str, t.a(str), false));
        }
        if (arrayList.removeIf(new Predicate() { // from class: yc.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SetLanguageDialog.c((SetLanguageEntry) obj);
            }
        })) {
            String strD = r.d();
            Objects.requireNonNull(strD);
            arrayList.add(0, new SetLanguageEntry(strD, t.a(r.d()), true));
            this.f44902e = r.d();
        } else if (!arrayList.isEmpty()) {
            ((SetLanguageEntry) arrayList.get(0)).setSelector(true);
            this.f44902e = ((SetLanguageEntry) arrayList.get(0)).getName();
        }
        return arrayList;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.tv_cancel) {
            dismiss();
            return;
        }
        if (id2 != R.id.tv_save) {
            return;
        }
        l0.X0(1);
        l0.r0(this.f44902e);
        c.h("");
        g.f("CACHE_HOME_TITLE_LIST", this.f44903f);
        g.f("CACHE_RANK_TITLE_LIST", this.f44903f);
        g.f("CACHE_RANK_MODEL_LIST", this.f44903f);
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(this.f44902e));
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f44901d, R.layout.dialog_language_set, null);
        d(viewGroup);
        setContentView(viewGroup);
        e();
    }
}
