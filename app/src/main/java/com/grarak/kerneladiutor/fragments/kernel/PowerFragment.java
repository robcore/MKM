package com.grarak.kerneladiutor.fragments.kernel;

import android.os.Bundle;

import com.grarak.kerneladiutor.R;
import com.grarak.kerneladiutor.elements.DAdapter;
import com.grarak.kerneladiutor.elements.DDivider;
import com.grarak.kerneladiutor.elements.cards.SwitchCardView;
import com.grarak.kerneladiutor.fragments.RecyclerViewFragment;
import com.grarak.kerneladiutor.utils.kernel.Power;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matt on 31.7.2016.
 */
public class PowerFragment extends RecyclerViewFragment implements SwitchCardView.DSwitchCard.OnDSwitchCardListener {

    private SwitchCardView.DSwitchCard mC0StateCard, mC1StateCard, mC2StateCard, mC3StateCard;

    @Override
    public void init(Bundle savedInstanceState) {
        super.init(savedInstanceState);

        cstatesInit();
    }

    private void cstatesInit() {
        List<DAdapter.DView> views = new ArrayList<>();
        if (Power.hasC0State()) {
            mC0StateCard = new SwitchCardView.DSwitchCard();
            mC0StateCard.setTitle(getString(R.string.c0state));
            mC0StateCard.setDescription(getString(R.string.c0state_summary));
            mC0StateCard.setChecked(Power.isC0StateActive());
            mC0StateCard.setOnDSwitchCardListener(this);
            views.add(mC0StateCard);
        }
        if (Power.hasC1State()) {
            mC1StateCard = new SwitchCardView.DSwitchCard();
            mC1StateCard.setTitle(getString(R.string.c1state));
            mC1StateCard.setDescription(getString(R.string.c1state_summary));
            mC1StateCard.setChecked(Power.isC1StateActive());
            mC1StateCard.setOnDSwitchCardListener(this);
            views.add(mC1StateCard);
        }
        if (Power.hasC2State()) {
            mC2StateCard = new SwitchCardView.DSwitchCard();
            mC2StateCard.setTitle(getString(R.string.c2state));
            mC2StateCard.setDescription(getString(R.string.c2state_summary));
            mC2StateCard.setChecked(Power.isC2StateActive());
            mC2StateCard.setOnDSwitchCardListener(this);
            views.add(mC2StateCard);
        }
        if (Power.hasC3State()) {
            mC3StateCard = new SwitchCardView.DSwitchCard();
            mC3StateCard.setTitle(getString(R.string.c3state));
            mC3StateCard.setDescription(getString(R.string.c3state_summary));
            mC3StateCard.setChecked(Power.isC3StateActive());
            mC3StateCard.setOnDSwitchCardListener(this);
            views.add(mC3StateCard);
        }
        if (views.size() > 0) {
            DDivider mCstatesCard = new DDivider();
            mCstatesCard.setText(getString(R.string.cstates));
            addView(mCstatesCard);
            addAllViews(views);
        }
    }

    @Override
    public void onChecked(SwitchCardView.DSwitchCard dSwitchCard, boolean checked) {
        if (dSwitchCard == mC0StateCard)
            Power.activateC0State(checked, getActivity());
        else if (dSwitchCard == mC1StateCard)
            Power.activateC1State(checked, getActivity());
        else if (dSwitchCard == mC2StateCard)
            Power.activateC2State(checked, getActivity());
        else if (dSwitchCard == mC3StateCard)
            Power.activateC3State(checked, getActivity());
    }
}
