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
@JSImport("material-ui-icons/Block",JSImport.Default)
object MuiBlockIconComponent extends JSComponent[js.Object]

object MuiBlockIcon {

 @inline
 def apply(style : OptionalParam[js.Any] = OptDefault,
   className : OptionalParam[String] = OptDefault,
   id : OptionalParam[String] = OptDefault,
      @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null ): ReactElement { type Instance = MuiBlockIconComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiBlockIconComponent.type](
      MuiBlockIconComponent,
      props,
      key)
    }

}

        
