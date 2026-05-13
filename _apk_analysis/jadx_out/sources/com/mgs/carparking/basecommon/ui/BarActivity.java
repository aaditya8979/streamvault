package com.mgs.carparking.basecommon.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dramarush.shortin.R;
import com.google.android.material.appbar.AppBarLayout;
import com.mgs.carparking.basecommon.widget.VariedTextView;
import ec.f;

/* JADX INFO: loaded from: classes8.dex */
public class BarActivity extends BaseActivity {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FrameLayout f42512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FrameLayout f42513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f42514s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42511p = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f42515t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f42516u = 0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((InputMethodManager) BarActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec.c f42518b;

        public b(ec.c cVar) {
            this.f42518b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ec.c cVar = this.f42518b;
            if (cVar != null) {
                cVar.apply();
            } else {
                BarActivity.this.onBackPressed();
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec.c f42520b;

        public c(ec.c cVar) {
            this.f42520b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ec.c cVar = this.f42520b;
            if (cVar != null) {
                cVar.apply();
            }
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec.c f42522b;

        public d(ec.c cVar) {
            this.f42522b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ec.c cVar = this.f42522b;
            if (cVar != null) {
                cVar.apply();
            }
        }
    }

    @NonNull
    public View getActionBarContentView(FrameLayout frameLayout) {
        return LayoutInflater.from(this).inflate(R.layout.action_bar_header, (ViewGroup) frameLayout, false);
    }

    public boolean isCreateActionBar() {
        return this.f42511p;
    }

    @Override // com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        f.c(this);
    }

    @Override // com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void setActionBarBg(@ColorInt int i10) {
        if (!this.f42511p) {
            throw new NullPointerException("createActionBar false");
        }
        ((AppBarLayout) findViewById(R.id.rootActionBarView)).setBackgroundColor(i10);
    }

    public void setActionBarRight(ec.c cVar) {
        setActionBarRight(null, cVar);
    }

    public void setActionBarRight(@Nullable String str, ec.c cVar) {
        if (!this.f42511p) {
            throw new NullPointerException("createActionBar false");
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.flRightButton);
        TextView textView = (TextView) findViewById(R.id.rightText);
        textView.setVisibility(0);
        if (str != null) {
            textView.setText(str);
        }
        frameLayout.setOnClickListener(new c(cVar));
    }

    public void setActionBarTitle(@Nullable String str) {
        setActionBarTitle(str, false, null);
    }

    public void setActionBarTitle(@Nullable String str, boolean z10, ec.c cVar) {
        if (!this.f42511p) {
            ub.a.a(BarActivity.class, "createActionBar false");
        }
        TextView textView = (TextView) findViewById(R.id.title);
        VariedTextView variedTextView = (VariedTextView) findViewById(R.id.leftButton);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        variedTextView.setVisibility(z10 ? 0 : 8);
        if (z10) {
            variedTextView.setOnClickListener(new b(cVar));
        }
    }

    public void setActionBarTitle(boolean z10, ec.c cVar) {
        setActionBarTitle("", z10, cVar);
    }

    public void setActionLeftIcon(@DrawableRes int i10, ec.c cVar) {
        if (!this.f42511p) {
            throw new NullPointerException("createActionBar false");
        }
        ImageView imageView = (ImageView) findViewById(R.id.leftImage);
        ((VariedTextView) findViewById(R.id.leftButton)).setVisibility(8);
        imageView.setVisibility(0);
        imageView.setBackgroundResource(i10);
        imageView.setOnClickListener(new d(cVar));
    }

    public void setActionTitleColor(@ColorInt int i10) {
        if (!this.f42511p) {
            throw new NullPointerException("createActionBar false");
        }
        ((TextView) findViewById(R.id.title)).setTextColor(i10);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.activity_base_layout, (ViewGroup) null, false);
        this.f42514s = viewInflate;
        super.setContentView(viewInflate);
        this.f42512q = (FrameLayout) findViewById(R.id.contentParent);
        setContentView(LayoutInflater.from(this).inflate(i10, (ViewGroup) this.f42512q, false));
    }

    public void setContentView(int i10, boolean z10) {
        setCreateActionBar(z10);
        setContentView(i10);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        if (this.f42512q == null) {
            super.setContentView(R.layout.activity_base_layout);
            this.f42514s = findViewById(R.id.rootView);
            this.f42512q = (FrameLayout) findViewById(R.id.contentParent);
        }
        this.f42514s.setFitsSystemWindows(this.f42515t);
        FrameLayout frameLayout = this.f42512q;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new a());
        }
        this.f42512q.addView(view);
        if (this.f42511p) {
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.barRootView);
            this.f42513r = frameLayout2;
            frameLayout2.setVisibility(0);
            View actionBarContentView = getActionBarContentView(this.f42513r);
            if (actionBarContentView == null) {
                throw new NullPointerException("createActionBar cannot are return for null");
            }
            this.f42513r.addView(actionBarContentView);
        }
    }

    public void setContentView(View view, boolean z10) {
        setCreateActionBar(z10);
        setContentView(view);
    }

    public void setCreateActionBar(boolean z10) {
        this.f42511p = z10;
    }

    public void setFitsSystemWindows(boolean z10) {
        View view = this.f42514s;
        if (view != null) {
            view.setFitsSystemWindows(z10);
        }
        this.f42515t = z10;
    }
}
