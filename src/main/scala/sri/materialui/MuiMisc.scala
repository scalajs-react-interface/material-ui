
package sri.materialui


import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  rename,
  OptDefault,
  OptionalParam
}
import sri.universal._
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.annotation.ScalaJSDefined
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.vdom.ReactEventAliases._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     


@js.native
@JSImport("material-ui/utils/customPropTypes",JSImport.Default)
object MuiCustomPropTypes extends js.Object {

 val muiRequired: js.Any = js.native

}


abstract class MuiAwareComponent[P >: Null <: AnyRef, S >: Null <: AnyRef]
    extends Component[P, S] {

  @inline
  def styleManager: MuiStyleManager =
    context.styleManager.asInstanceOf[MuiStyleManager]

}


abstract class MuiAwareComponentP[P >: Null <: AnyRef]
    extends ComponentP[P] {

  @inline
  def styleManager: MuiStyleManager =
    context.styleManager.asInstanceOf[MuiStyleManager]

}


abstract class MuiAwareComponentS[S >: Null <: AnyRef]
    extends ComponentS[S] {

  @inline
  def styleManager: MuiStyleManager =
    context.styleManager.asInstanceOf[MuiStyleManager]

}


@js.native
trait MuiStyleManager extends js.Object {
  val theme : MuiTheme = js.native
  val jss: js.Dynamic = js.native
}


@js.native
trait MuiBreakpoint extends js.Object

object MuiBreakpoint {

  @inline def  XS = "xs".asInstanceOf[MuiBreakpoint]

  @inline def  SM = "sm".asInstanceOf[MuiBreakpoint]

  @inline def  MD = "md".asInstanceOf[MuiBreakpoint]

  @inline def  LG = "lg".asInstanceOf[MuiBreakpoint]

  @inline def  XL = "xl".asInstanceOf[MuiBreakpoint]

}


       