

package sri.materialui.svgicons


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
@JSImport("material-ui-icons/Room",JSImport.Default)
object MuiRoomIconComponent extends JSComponent[js.Object]

object MuiRoomIcon {

 @inline
 def apply(style : OptionalParam[js.Any] = OptDefault,
   className : OptionalParam[String] = OptDefault,
   id : OptionalParam[String] = OptDefault,
      @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null ): ReactElement { type Instance = MuiRoomIconComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiRoomIconComponent.type](
      MuiRoomIconComponent,
      props,
      key)
    }

}

        