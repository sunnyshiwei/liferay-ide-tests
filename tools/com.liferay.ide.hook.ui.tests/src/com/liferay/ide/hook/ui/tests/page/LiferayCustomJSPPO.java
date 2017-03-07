/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.hook.ui.tests.page;

import org.eclipse.swtbot.swt.finder.SWTBot;
import com.liferay.ide.hook.ui.tests.HookConfigurationWizard;
import com.liferay.ide.project.ui.tests.ProjectWizard;
import com.liferay.ide.ui.tests.swtbot.page.DialogPO;
import com.liferay.ide.ui.tests.swtbot.page.TextPO;
import com.liferay.ide.ui.tests.swtbot.page.TreePO;

/**
 * @author Vicky Wang
 */
public class LiferayCustomJSPPO extends DialogPO implements HookConfigurationWizard, ProjectWizard
{

    private TreePO _pathTree;
    private TextPO _selectJspToCustomize;

    public LiferayCustomJSPPO( SWTBot bot )
    {
        this( bot, TEXT_BLANK );
    }

    public LiferayCustomJSPPO( SWTBot bot, String title )
    {
        super( bot, title, BUTTON_CANCEL, BUTTON_OK );

        _pathTree = new TreePO( bot );
        _selectJspToCustomize = new TextPO( bot, LABEL_SELECT_A_JSP_TO_CUSTOMIZE );
    }

    public void select( String... items )
    {
        _pathTree.selectTreeItem( items );
    }

    public TextPO getSelectJspToCustomize()
    {
        return _selectJspToCustomize;
    }

    public void setSelectJspToCustomize( String selectJspToCustomize )
    {
        this._selectJspToCustomize.setText( selectJspToCustomize );;
    }

}