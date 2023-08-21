/*
 * This file is part of the PDF Split And Merge source code
 * Created on 03 dic 2015
 * Copyright 2017 by Sober Lemur S.r.l. (info@pdfsam.org).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.gui.components.dialog;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import javafx.stage.Stage;

import static org.pdfsam.i18n.I18nContext.i18n;

/**
 * Dialog asking the user if he wants to create a non existing output directory
 * 
 * @author Andrea Vacondio
 */
public class CreateOutputDirectoryConfirmationDialog extends ConfirmationDialog {

    @Inject
    public CreateOutputDirectoryConfirmationDialog(@Named("primaryStage") Stage stage) {
        super(DialogStyle.QUESTION, stage, i18n().tr("Yes"), i18n().tr("No"));
        this.title(i18n().tr("Non existing directory"))
                .messageTitle(i18n().tr("The selected output directory does not exist"))
                .messageContent(i18n().tr("Do you want to create it?"));
    }

}
