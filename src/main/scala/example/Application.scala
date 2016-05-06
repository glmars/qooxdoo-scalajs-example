package example

import org.scalajs.dom.window.alert
import qx.ui.container.Composite
import qx.ui.form.Button
import qx.ui.layout.Flow
import qx.ui.tabview.{Page, TabView}

import scala.scalajs.js
import scala.scalajs.js.JSApp

object Application extends JSApp
{
	def main()
	{
		qx.registry.Registry.registerMainMethod(qooxdooMain _)
	}

	private def qooxdooMain(app: qx.application.Standalone)
	{
		val demo = Array(createButton _, createForm _)

		val tabView = new TabView()
		demo.zipWithIndex.foreach{case (func, idx) =>
		{
			val page = createPage(s"Example ${idx + 1}")
			page.add(func())
			tabView.add(page)
		}}

		val root = app.getRoot().asInstanceOf[Composite]
		root.add(tabView, js.Dynamic.literal(edge = 0))
	}

	private def createPage(name: String): Page =
	{
		val page = new Page(name)
		page.setLayout(new Flow())
		page.setShowCloseButton(true)
		page
	}

	private def createButton(): Button =
	{
		val button1 = new Button("First Button", "icon/22/apps/internet-web-browser.png")

		button1.addListener("execute", () =>
		{
			alert("Hello World!")
		})

		button1
	}

	private def createForm(): qx.ui.core.Widget =
	{
		val form = new qx.ui.form.Form()

		// add the first headline
		form.addGroupHeader("Registration")

		// add usernamne
		val userName = new qx.ui.form.TextField()
		userName.setRequired(true)
		form.add(userName, "Name")
		// add password
		val password = new qx.ui.form.PasswordField()
		password.setRequired(true)
		form.add(password, "Password")
		// add a save checkbox
		form.add(new qx.ui.form.CheckBox(), "Save?")

		// add the second header
		form.addGroupHeader("Personal Information")

		// add some additional widgets
		form.add(new qx.ui.form.Spinner(), "Age")
		form.add(new qx.ui.form.TextField(), "Country")
		val genderBox = new qx.ui.form.SelectBox()
		genderBox.add(new qx.ui.form.ListItem("male"))
		genderBox.add(new qx.ui.form.ListItem("female"))
		form.add(genderBox, "Gender")
		form.add(new qx.ui.form.TextArea(), "Bio")

		// send button with validation
		val sendButton = new qx.ui.form.Button("Send")
		sendButton.addListener("execute", () =>
		{
			if(form.validate())
			{
				alert("send...")
			}
		})
		form.addButton(sendButton)

		// reset button
		val resetButton = new qx.ui.form.Button("Reset")
		resetButton.addListener("execute",  form.reset _)
		form.addButton(resetButton)

		// create the form and return it
		new qx.ui.form.renderer.Single(form)
	}

//
//	/**
//	  * Create some reandom rows for the table example
//	  */
//	private def createRandomRows(rowCount: number)
//	{
//		val rowData =[]
//		val now = new js.Date().getTime()
//		val dateRange = 400 * 24 * 60 * 60 * 1000 // 400 days
//	val nextId = 0
//		for(val row = 0 row < rowCount row ++)
//		{
//			val date = new js.Date(now + Math.random() * dateRange - dateRange / 2)
//			rowData.push([nextId ++, Math.random() * 10000, date, (Math.random() > 0.5)] )
//		}
//		rowData
//	}
//
//	/**
//	  * Create an example using the table widget showing some basic
//	  * funcitonality
//	  */
//	private def createTable(): qx.ui.core.Widget =
//		{
//			// table model
//			val tableModel = new qx.ui.table.model.Simple ()
//
//			tableModel.setColumns (["Billing-ID", "Amount", "Date", "Paid"] )
//			tableModel.setData (createRandomRows (100) )
//
//			// make second column editable
//			tableModel.setColumnEditable (1, true)
//
//			// table
//			val table = new qx.ui.table.Table (tableModel)
//			table.set (
//		{
//			decorator: null
//		})
//
//			val tcm = table.getTableColumnModel ()
//
//			// Display a checkbox in column 3
//			tcm.setDataCellRenderer (3, new qx.ui.table.cellrenderer.Boolean () )
//
//			table
//		}
//
//	/**
//	  * Create a sample tree
//	  */
//	private def createTree(): qx.ui.core.Widget =
//		{
//			// create the tree
//			val tree = new qx.ui.tree.Tree ()
//			tree.set (
//		{width: 150, height: 300})
//
//			// create and set the tree root
//			val root = new qx.ui.tree.TreeFolder ("Desktop")
//			tree.setRoot (root)
//
//			// create some subitems
//			val f1 = new qx.ui.tree.TreeFolder ("Logos")
//			val f2 = new qx.ui.tree.TreeFolder ("TODO")
//			val f3 = new qx.ui.tree.TreeFile ("jsmag_js9.pdf")
//			f3.setIcon ("icon/22/mimetypes/text-html.png")
//			root.add (f1, f2, f3)
//
//			// create a third layer
//			val f11 = new qx.ui.tree.TreeFile ("Logo1.png")
//			f11.setIcon ("icon/22/mimetypes/media-image.png")
//			val f12 = new qx.ui.tree.TreeFile ("Logo2.png")
//			f12.setIcon ("icon/22/mimetypes/media-image.png")
//			val f13 = new qx.ui.tree.TreeFile ("Logo3.png")
//			f13.setIcon ("icon/22/mimetypes/media-image.png")
//			f1.add (f11, f12, f13)
//
//			// open the folders
//			root.setOpen (true)
//			f1.setOpen (true)
//			tree
//		}
}

