package com.mgs.carparking.shorttk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.TKBean;
import com.mgs.carparking.widgets.FlowLayout2;
import com.mgs.carparking.widgets.rv.HorizontalItemFourDecoration;
import com.ruffian.library.widget.RImageView;
import com.ruffian.library.widget.RTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CommentDialog extends BaseBottomSheetDialog {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<TKBean> f44328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TKBean f44329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f44331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f44332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExpandableTextView f44333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RImageView f44334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f44335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f44336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FlowLayout2 f44337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout.LayoutParams f44338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f44339o;

    public class a implements c.InterfaceC0537c {
        public a() {
        }

        @Override // com.mgs.carparking.shorttk.CommentDialog.c.InterfaceC0537c
        public void a(int i10, TKBean tKBean) {
            b bVar = CommentDialog.this.f44339o;
            if (bVar != null) {
                bVar.a(i10);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public static class c extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LayoutInflater f44341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Context f44342j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<TKBean> f44343k = new ArrayList();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public InterfaceC0537c f44344l;

        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f44345b;

            public a(int i10) {
                this.f44345b = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.f44344l != null) {
                    c.this.f44344l.a(this.f44345b, (TKBean) c.this.f44343k.get(this.f44345b));
                }
            }
        }

        public class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public RTextView f44347l;

            public b(@NonNull View view) {
                super(view);
                this.f44347l = (RTextView) view.findViewById(R.id.text1);
            }
        }

        /* JADX INFO: renamed from: com.mgs.carparking.shorttk.CommentDialog$c$c, reason: collision with other inner class name */
        public interface InterfaceC0537c {
            void a(int i10, TKBean tKBean);
        }

        public c(Context context) {
            this.f44342j = context;
            this.f44341i = LayoutInflater.from(context);
        }

        public void e(List<TKBean> list) {
            this.f44343k = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i10) {
            ie.c helper = bVar.f44347l.getHelper();
            if (this.f44343k.get(i10).getNetCineVarIsTrue()) {
                helper.n(bVar.itemView.getContext().getResources().getColor(R.color.color_272b30)).q(bVar.itemView.getContext().getResources().getColor(R.color.color_commen)).r(2).t(5.0f);
                bVar.f44347l.setTextColor(bVar.itemView.getContext().getResources().getColor(R.color.color_commen));
            } else {
                helper.n(bVar.itemView.getContext().getResources().getColor(R.color.color_343940)).t(5.0f);
                bVar.f44347l.setTextColor(bVar.itemView.getContext().getResources().getColor(R.color.white));
            }
            bVar.f44347l.setText((i10 + 1) + "");
            bVar.f44347l.setTextColor(this.f44342j.getResources().getColor(R.color.color_text_commen1));
            bVar.f44347l.setGravity(17);
            bVar.f44347l.setOnClickListener(new a(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new b(this.f44341i.inflate(R.layout.eps_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f44343k.size();
        }

        public void h(InterfaceC0537c interfaceC0537c) {
            this.f44344l = interfaceC0537c;
        }
    }

    public CommentDialog(List<TKBean> list, TKBean tKBean, int i10) {
        this.f44328d = list;
        this.f44329e = tKBean;
        this.f44330f = i10;
    }

    @Override // com.mgs.carparking.shorttk.BaseBottomSheetDialog
    public int c() {
        return -2;
    }

    public void d(List<String> list) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f44338n = layoutParams;
        layoutParams.setMargins(10, 10, 10, 10);
        FlowLayout2 flowLayout2 = this.f44337m;
        if (flowLayout2 != null) {
            flowLayout2.removeAllViews();
        }
        if (list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                e(list.get(i10));
            }
        }
    }

    public void e(String str) {
        TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.item_short_tag, (ViewGroup) this.f44337m, false).findViewById(R.id.tv_name);
        textView.setText(str);
        this.f44337m.addView(textView, 0, this.f44338n);
        if (this.f44337m.getChildCount() == 6) {
            this.f44337m.removeViewAt(5);
        }
    }

    public final void f(View view) {
        this.f44331g = (RecyclerView) view.findViewById(R.id.recyclerView);
        this.f44337m = (FlowLayout2) view.findViewById(R.id.fl_search_history);
        this.f44334j = (RImageView) view.findViewById(R.id.mCover);
        this.f44335k = (TextView) view.findViewById(R.id.mTitle);
        this.f44336l = (TextView) view.findViewById(R.id.mCount);
        this.f44333i = (ExpandableTextView) view.findViewById(R.id.tv_vod_des);
        ud.c.d(getActivity(), this.f44329e.getNetCineVarListVod_pic(), this.f44334j, false);
        this.f44335k.setText(this.f44329e.netCineVarListVod_name);
        this.f44333i.setContent(this.f44329e.getNetCineVarListVod_blurb());
        this.f44336l.setText("1-" + this.f44328d.size());
        d(Arrays.asList(this.f44329e.getNetCineVarListVod_tag().split("/")));
        for (int i10 = 0; i10 < this.f44328d.size(); i10++) {
            this.f44328d.get(i10).setNetCineVarIsTrue(false);
        }
        this.f44328d.get(this.f44330f).setNetCineVarIsTrue(true);
        this.f44331g.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        this.f44331g.addItemDecoration(new HorizontalItemFourDecoration((int) getActivity().getResources().getDimension(R.dimen.dp_4), getActivity()));
        c cVar = new c(getActivity());
        this.f44331g.setAdapter(cVar);
        cVar.e(this.f44328d);
        cVar.h(new a());
    }

    public void g(b bVar) {
        this.f44339o = bVar;
    }

    public void h(int i10) {
        this.f44330f = i10;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_recyclerview, viewGroup);
        this.f44332h = viewInflate;
        f(viewInflate);
        return this.f44332h;
    }
}
