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
public class PropertySelectionPO extends DialogPO implements HookConfigurationWizard, ProjectWizard
{

    private TreePO _pathTree;
    private TextPO _pleaseSelectProperty;

    public PropertySelectionPO( SWTBot bot )
    {
        this( bot, TEXT_BLANK );
    }

    public PropertySelectionPO( SWTBot bot, String title )
    {
        super( bot, title, BUTTON_CANCEL, BUTTON_OK );
        _pathTree = new TreePO( bot );
        _pleaseSelectProperty = new TextPO( bot, LABLE_PLEASE_SELECT_A_PROPERTY );
    }

    public TextPO getPleaseSelectProperty()
    {
        return _pleaseSelectProperty;
    }

    public void setPleaseSelectProperty( String pleaseSelectProperty )
    {
        this._pleaseSelectProperty.setText( pleaseSelectProperty );;
    }

    public void select( String... items )
    {
        _pathTree.selectTreeItem( items );
    }

}
