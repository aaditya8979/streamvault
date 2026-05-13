package sg.bigo.ads.common.form;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.api.a.f;
import sg.bigo.ads.common.form.render.a.d;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.common.form.render.b f82041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f82042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewFlow f82043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Indicator f82044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f82045e;

    private c(@NonNull RelativeLayout relativeLayout, @NonNull sg.bigo.ads.common.form.render.b bVar) {
        this.f82042b = relativeLayout;
        this.f82041a = bVar;
        this.f82043c = (ViewFlow) relativeLayout.findViewById(R.id.inter_image_view_flow);
        this.f82044d = (Indicator) relativeLayout.findViewById(R.id.inter_image_indicator);
        this.f82045e = (LinearLayout) relativeLayout.findViewById(R.id.inter_form_content);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static c a(Context context, @NonNull e eVar, @Nullable Map<String, Object> map, boolean z10, int i10, int i11, b.a aVar) {
        ViewGroup.LayoutParams layoutParams;
        int iA;
        RelativeLayout relativeLayout;
        sg.bigo.ads.common.form.render.b bVar = new sg.bigo.ads.common.form.render.b(context, eVar, map, i10, i11, aVar);
        sg.bigo.ads.common.form.render.a.a bVar2 = null;
        View view = null;
        RelativeLayout relativeLayout2 = (RelativeLayout) sg.bigo.ads.common.utils.a.a(bVar.f82073a, sg.bigo.ads.common.form.render.a.a(3), null, false);
        bVar.f82077e = relativeLayout2;
        if (relativeLayout2 == null) {
            relativeLayout = null;
        } else {
            if (z10) {
                sg.bigo.ads.common.form.render.c.a(relativeLayout2, bVar.f82073a, bVar.f82074b, bVar, 5);
            } else {
                sg.bigo.ads.common.form.render.b.a((TextView) relativeLayout2.findViewById(R.id.inter_form_content_title), bVar.f82074b.a());
                sg.bigo.ads.common.form.render.b.a((TextView) bVar.f82077e.findViewById(R.id.inter_form_content_description), bVar.f82074b.b());
                RelativeLayout relativeLayout3 = bVar.f82077e;
                e eVar2 = bVar.f82074b;
                int i12 = 1;
                if (eVar2.k() == null || !q.b((CharSequence) eVar2.k().c())) {
                    ViewGroup viewGroup = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_icon_layout);
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_content_layout);
                    if (viewGroup2 != null) {
                        viewGroup2.setPadding(0, 0, 0, 0);
                    }
                } else {
                    ImageView imageView = (ImageView) relativeLayout3.findViewById(R.id.inter_form_content_icon);
                    if (imageView != null) {
                        new sg.bigo.ads.common.p.b(imageView, (byte) 0).a(null, eVar2.k().c(), true);
                    }
                }
                RelativeLayout relativeLayout4 = bVar.f82077e;
                Context context2 = bVar.f82073a;
                e eVar3 = bVar.f82074b;
                View viewFindViewById = relativeLayout4.findViewById(R.id.inter_blank_viewholder);
                if (viewFindViewById != null && eVar3.j() != null) {
                    int iA2 = sg.bigo.ads.common.form.render.c.a(context2, eVar3);
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                    layoutParams2.height = iA2 - sg.bigo.ads.common.utils.e.a(context2, 8);
                    viewFindViewById.setLayoutParams(layoutParams2);
                }
                FrameLayout frameLayout = (FrameLayout) relativeLayout4.findViewById(R.id.inter_form_icon_layout);
                if (frameLayout != null) {
                    if (eVar3.j() == null) {
                        iA = 0;
                    } else {
                        iA = sg.bigo.ads.common.form.render.c.a(context2, eVar3) - sg.bigo.ads.common.utils.e.a(context2, 33);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams3.topMargin = iA;
                        frameLayout.setLayoutParams(layoutParams3);
                    }
                    HeightScrollView heightScrollView = (HeightScrollView) relativeLayout4.findViewById(R.id.inter_form_scroll);
                    if (heightScrollView != null) {
                        heightScrollView.setBlankView(viewFindViewById);
                        heightScrollView.setOnScrollListener(new HeightScrollView.a() { // from class: sg.bigo.ads.common.form.render.c.6

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ FrameLayout f82100a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ int f82101b;

                            public AnonymousClass6(FrameLayout frameLayout2, int iA3) {
                                frameLayout = frameLayout2;
                                i = iA3;
                            }

                            @Override // sg.bigo.ads.common.view.HeightScrollView.a
                            public final void a(int i13) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                                marginLayoutParams.topMargin = i - i13;
                                frameLayout.setLayoutParams(marginLayoutParams);
                            }
                        });
                    }
                }
                Button button = (Button) bVar.f82077e.findViewById(R.id.inter_form_submit);
                bVar.f82076d = button;
                if (button != null) {
                    button.setText(a.a(bVar.f82073a, R.string.bigo_ad_form_submit));
                    bVar.f82076d.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.b.3
                        public AnonymousClass3() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            View viewC;
                            GradientDrawable gradientDrawable;
                            b bVar3 = b.this;
                            bVar3.a(3, bVar3.f82079g, System.currentTimeMillis() - b.this.f82078f);
                            sg.bigo.ads.common.form.render.a.c cVar = b.this.f82075c;
                            if (cVar == null) {
                                viewC = null;
                            } else {
                                List<sg.bigo.ads.common.form.render.a.a> list = cVar.f82067g;
                                int size = list == null ? 0 : list.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    sg.bigo.ads.common.form.render.a.a aVar2 = cVar.f82067g.get(i13);
                                    if (aVar2 != null && aVar2.a()) {
                                        viewC = aVar2.c();
                                        break;
                                    }
                                }
                                viewC = null;
                            }
                            if (viewC != null) {
                                RelativeLayout relativeLayout5 = b.this.f82077e;
                                HeightScrollView heightScrollView2 = (HeightScrollView) relativeLayout5.findViewById(R.id.inter_form_scroll);
                                View viewFindViewById2 = relativeLayout5.findViewById(R.id.inter_blank_viewholder);
                                int height = viewFindViewById2 != null ? viewFindViewById2.getHeight() : 0;
                                if (heightScrollView2 != null) {
                                    heightScrollView2.scrollTo(0, viewC.getTop() + height);
                                    return;
                                }
                                return;
                            }
                            if (b.this.f82075c.b()) {
                                b bVar4 = b.this;
                                c.a(bVar4.f82077e, bVar4.f82073a, bVar4.f82074b, bVar4, 1);
                                return;
                            }
                            b bVar5 = b.this;
                            RelativeLayout relativeLayout6 = bVar5.f82077e;
                            Context context3 = bVar5.f82073a;
                            e eVar4 = bVar5.f82074b;
                            ViewGroup viewGroup3 = (ViewGroup) relativeLayout6.findViewById(R.id.inter_privacy_notice_container);
                            View viewA = sg.bigo.ads.common.utils.a.a(context3, sg.bigo.ads.common.form.render.a.a(4), null, false);
                            if (viewA != null && viewGroup3 != null) {
                                u.a(viewA, viewGroup3, null, -1);
                                TextView textView = (TextView) viewA.findViewById(R.id.bigo_ad_form_btn_cancel);
                                if (textView != null) {
                                    if (context3 == null) {
                                        gradientDrawable = null;
                                    } else {
                                        boolean z11 = sg.bigo.ads.common.form.render.a.f82047a;
                                        int i14 = z11 ? -14931661 : -1;
                                        int i15 = z11 ? -10456960 : -4009768;
                                        gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(context3, 1), i15);
                                        gradientDrawable.setColor(i14);
                                        gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context3, 8));
                                    }
                                    textView.setBackground(gradientDrawable);
                                    textView.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_cancel));
                                    textView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.1

                                        /* JADX INFO: renamed from: a */
                                        public final /* synthetic */ View f82088a;

                                        /* JADX INFO: renamed from: b */
                                        public final /* synthetic */ a f82089b;

                                        public AnonymousClass1(View viewA2, a bVar52) {
                                            view = viewA2;
                                            aVar = bVar52;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            u.b(view);
                                            a aVar3 = aVar;
                                            if (aVar3 != null) {
                                                aVar3.b();
                                            }
                                        }
                                    });
                                }
                                TextView textView2 = (TextView) viewA2.findViewById(R.id.bigo_ad_form_btn_agree);
                                if (textView2 != null) {
                                    textView2.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_agree));
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.2

                                        /* JADX INFO: renamed from: a */
                                        public final /* synthetic */ View f82090a;

                                        /* JADX INFO: renamed from: b */
                                        public final /* synthetic */ ViewGroup f82091b;

                                        /* JADX INFO: renamed from: c */
                                        public final /* synthetic */ Context f82092c;

                                        /* JADX INFO: renamed from: d */
                                        public final /* synthetic */ e f82093d;

                                        /* JADX INFO: renamed from: e */
                                        public final /* synthetic */ a f82094e;

                                        public AnonymousClass2(View viewA2, ViewGroup relativeLayout62, Context context32, e eVar42, a bVar52) {
                                            view = viewA2;
                                            viewGroup = relativeLayout62;
                                            context = context32;
                                            eVar = eVar42;
                                            aVar = bVar52;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            u.b(view);
                                            c.a(viewGroup, context, eVar, aVar, 2);
                                            a aVar3 = aVar;
                                            if (aVar3 != null) {
                                                aVar3.c();
                                            }
                                        }
                                    });
                                }
                                PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) viewA2.findViewById(R.id.inter_form_check_box);
                                if (privacyCheckBox != null && textView2 != null) {
                                    privacyCheckBox.setOnCheckChangeListener(new PrivacyCheckBox.d() { // from class: sg.bigo.ads.common.form.render.c.3

                                        /* JADX INFO: renamed from: a */
                                        public final /* synthetic */ TextView f82095a;

                                        public AnonymousClass3(TextView textView22) {
                                            textView = textView22;
                                        }

                                        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.d
                                        public final void a(boolean z12) {
                                            textView.setBackgroundResource(z12 ? R.drawable.bigo_ad_btn_background : sg.bigo.ads.common.form.render.a.f82047a ? R.drawable.bigo_ad_btn_background_white_dark : R.drawable.bigo_ad_btn_background_white);
                                            textView.setClickable(z12);
                                        }
                                    });
                                }
                                c.a(viewA2, eVar42, null, bVar52);
                            }
                            b bVar6 = b.this;
                            bVar6.a(4, bVar6.f82079g, System.currentTimeMillis() - b.this.f82078f);
                        }
                    });
                }
                ViewGroup viewGroup3 = (ViewGroup) bVar.f82077e.findViewById(R.id.inter_form_content);
                if (viewGroup3 != null) {
                    sg.bigo.ads.common.form.render.a.c cVar = bVar.f82075c;
                    View viewA = sg.bigo.ads.common.utils.a.a(cVar.f82061a, sg.bigo.ads.common.form.render.a.a(5), null, false);
                    cVar.f82065e = viewA;
                    if (viewA == null) {
                        layoutParams = null;
                    } else {
                        ViewGroup viewGroup4 = (ViewGroup) viewA.findViewById(R.id.bigo_ad_id_form_question);
                        e.c[] cVarArr = cVar.f82064d;
                        if (cVarArr != null && viewGroup4 != null) {
                            int length = cVarArr.length;
                            int i13 = 0;
                            while (i13 < length) {
                                e.c cVar2 = cVarArr[i13];
                                Map<String, Object> map2 = cVar.f82062b;
                                Context context3 = cVar.f82061a;
                                if (cVar2 != null) {
                                    int i14 = cVar2.f81799b;
                                    bVar2 = i14 != i12 ? (i14 == 2 || i14 == 3) ? new sg.bigo.ads.common.form.render.a.b(cVar2, map2, context3, cVar) : null : new d(cVar2, map2, context3, cVar);
                                }
                                if (bVar2 != null) {
                                    cVar.f82067g.add(bVar2);
                                    View viewB = bVar2.b();
                                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                                    layoutParams4.bottomMargin = sg.bigo.ads.common.utils.e.a(cVar.f82061a, 27);
                                    u.a(viewB, viewGroup4, layoutParams4, -1);
                                }
                                i13++;
                                bVar2 = null;
                                i12 = 1;
                            }
                        }
                        TextView textView = (TextView) cVar.f82065e.findViewById(R.id.inter_form_question_purpose);
                        if (textView != null) {
                            textView.setText(cVar.f82063c.h());
                        }
                        cVar.f82066f = sg.bigo.ads.common.form.render.c.a(cVar.f82065e, cVar.f82063c, cVar.f82062b, cVar.f82068h);
                        view = cVar.f82065e;
                        layoutParams = null;
                    }
                    u.a(view, viewGroup3, layoutParams, -1);
                }
            }
            u.a(bVar.f82077e, new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.common.form.render.b.2
                public AnonymousClass2() {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    sg.bigo.ads.common.n.d.a(2, b.this.f82080h);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    b bVar3 = b.this;
                    bVar3.a(12, bVar3.f82079g, System.currentTimeMillis() - b.this.f82078f);
                }
            });
            relativeLayout = bVar.f82077e;
        }
        c cVar3 = new c(relativeLayout, bVar);
        cVar3.f82044d.setType(0);
        cVar3.f82044d.setRadius(sg.bigo.ads.common.utils.e.a(context, 3));
        cVar3.f82044d.setPadding(sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 3));
        cVar3.f82043c.setViewStyle(3);
        cVar3.f82043c.setFlipInterval(5000);
        cVar3.f82043c.setOnItemChangeListener(new ViewFlow.c() { // from class: sg.bigo.ads.common.form.c.1
            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i15) {
                Indicator indicator;
                int i16;
                c.this.f82044d.setNum(i15);
                if (i15 > 1) {
                    indicator = c.this.f82044d;
                    i16 = 0;
                } else {
                    indicator = c.this.f82044d;
                    i16 = 4;
                }
                indicator.setVisibility(i16);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i15, int i16) {
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(@NonNull View view2, int i15) {
                c.this.f82044d.a(i15);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(@NonNull View view2, int i15, float f10) {
                c.this.f82044d.a(f10, i15);
            }
        });
        cVar3.f82043c.getLayoutParams().height = sg.bigo.ads.common.form.render.c.a(context, eVar);
        f[] fVarArrI = eVar.i();
        if (!k.a(fVarArrI)) {
            for (f fVar : fVarArrI) {
                ImageView imageView2 = new ImageView(context);
                new sg.bigo.ads.common.p.b(imageView2).a(null, fVar.c(), false);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ViewFlow.b bVar3 = new ViewFlow.b();
                ((ViewGroup.LayoutParams) bVar3).width = -1;
                ((ViewGroup.LayoutParams) bVar3).height = -2;
                bVar3.f82684e = 48;
                bVar3.f82683d = 3;
                cVar3.f82043c.addView(imageView2, bVar3);
                if (eVar.f() == 0) {
                    break;
                }
            }
        }
        return cVar3;
    }
}
