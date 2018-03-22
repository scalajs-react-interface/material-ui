package sri.materialui.svgicons


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
@JSImport("material-ui-icons/Brightness2",JSImport.Default)
object MuiBrightness2IconComponent extends JSComponent[js.Object]

object MuiBrightness2Icon {

 @inline
 def apply(style : OptionalParam[js.Any] = OptDefault,
   className : OptionalParam[String] = OptDefault,
   id : OptionalParam[String] = OptDefault,
      @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null ): ReactElement { type Instance = MuiBrightness2IconComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiBrightness2IconComponent.type](
      MuiBrightness2IconComponent,
      props,
      key)
    }

}

        
