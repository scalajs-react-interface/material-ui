

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
@JSImport("material-ui-icons/FilterHdr",JSImport.Default)
object MuiFilterHdrIconComponent extends JSComponent[js.Object]

object MuiFilterHdrIcon {

 @inline
 def apply(style : OptionalParam[js.Any] = OptDefault,
   className : OptionalParam[String] = OptDefault,
   id : OptionalParam[String] = OptDefault,
      @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null ): ReactElement { type Instance = MuiFilterHdrIconComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiFilterHdrIconComponent.type](
      MuiFilterHdrIconComponent,
      props,
      key)
    }

}

        