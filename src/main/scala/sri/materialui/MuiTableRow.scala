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
 @JSImport("material-ui/Table","TableRow")
object MuiTableRowComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiTableRow {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
hover : OptionalParam[Boolean] = OptDefault,
selected : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTableRowComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTableRowComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTableRowComponent.type](
      MuiTableRowComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiTableRowC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTableRowComponent.type](
      MuiTableRowComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         


     

         
