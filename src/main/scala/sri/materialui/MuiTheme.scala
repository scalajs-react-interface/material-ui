package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     

@js.native
trait MuiTheme extends js.Object

@js.native
trait MuiThemePalette extends js.Object

@js.native
@JSImport("material-ui/styles","createMuiTheme")
object CreateMuiTheme extends js.Object {
   def apply(options: js.Object): MuiTheme = js.native
}

@js.native
@JSImport("material-ui/styles/createPalette",JSImport.Default)
object CreatePalette extends js.Object {
   def apply(options: js.Object): MuiThemePalette = js.native
}

       
